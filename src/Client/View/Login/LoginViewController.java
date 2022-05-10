package Client.View.Login;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;

import java.awt.*;

public class LoginViewController implements ViewController
{
  private ViewHandler viewHandler;
  private LoginViewModel viewModel;
  @FXML TextField userIdTextField;
  @FXML PasswordField passwordField;
  @FXML Button loginButton;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory)
  {
    this.viewHandler = viewHandler;
    viewModel = viewModelFactory.getLoginViewModel();
  }

  public void onLoginButton()
  {
    String username = userIdTextField.getText();
    String password = passwordField.getText();
    viewModel.login(username,password);
  }

}
