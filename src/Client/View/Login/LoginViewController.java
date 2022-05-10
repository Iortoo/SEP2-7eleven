package Client.View.Login;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.beans.PropertyChangeEvent;
import java.io.IOException;

public class LoginViewController implements ViewController
{
  private ViewHandler viewHandler;
  private LoginViewModel viewModel;
  @FXML TextField idTextField;
  @FXML PasswordField passwordField;
  @FXML Button loginButton;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory)
  {
    this.viewHandler = viewHandler;
    viewModel = viewModelFactory.getLoginViewModel();
    viewModel.getModel().addListener("validation",this::validation);
  }

  public void onLoginButton()
  {
    String username = idTextField.getText();
    String password = passwordField.getText();
    viewModel.login(username,password);
  }

  private void loginAccepted() throws IOException
  {
    viewHandler.openOverviewView();
  }

  private void usernameError() throws IOException
  {
    // viewHandler.openUsernameErrorView()
  }

  private void passwordError() throws IOException
  {
    //viewHandler.openPasswordErrorView()
  }

  public void validation(PropertyChangeEvent event)
  {
    switch((int)event.getNewValue())
    {
      case 1:
      {
        try{loginAccepted();}
        catch(IOException e){}
      }break;
      case 0:
      {
        try{usernameError();}
        catch(IOException e){};
      }break;
      case 2:
      {
        try{passwordError();}
        catch(IOException e){};
      }
    }
  }
}
