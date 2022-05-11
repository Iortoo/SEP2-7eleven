package Client.View.Login;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javax.swing.*;
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


    idTextField.textProperty().bindBidirectional(this.viewModel.userIdProperty());
    passwordField.textProperty().bindBidirectional(this.viewModel.passwordProperty());
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
     JOptionPane.showMessageDialog(null,"Invalid username.");
     reset();

  }

  private void passwordError() throws IOException
  {
    JOptionPane.showMessageDialog(null,"Invalid password.");
    reset();
  }

  private void notExistInDatabaseError() throws IOException
  {
    JOptionPane.showMessageDialog(null,"Username and password does not exist in the database.");
    reset();
  }
  private void isNullError() throws IOException
  {
    JOptionPane.showMessageDialog(null,"You must enter username and password.");
    reset();
  }


  public void validation(PropertyChangeEvent event)
  {
    // 1 if credentials are valid
    // 0 if password is incorrect
    // -1 if username is incorrect
    // 2 if username does not exist in the database
    // 3 if username or password is null

    switch((int)event.getNewValue())
    {
      case 1:
      {
        try{loginAccepted();}
        catch(IOException e){}
      }break;
      case -1:
      {
        try{usernameError();}
        catch(IOException e){};
      }break;
      case 0:
      {
        try{passwordError();}
        catch(IOException e){};
      }
      break;
      case 2:
      {
        try{notExistInDatabaseError();}
        catch(IOException e){};
      }
      break;
      case 3:
      {
        try{isNullError();}
        catch(IOException e){};
      }
    }
  }



  public void reset(){
    viewModel.reset();
  }

}
