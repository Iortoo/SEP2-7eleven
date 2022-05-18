package Client.View.Register;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.IOException;
import java.rmi.RemoteException;

public class RegisterViewController implements ViewController
{
  private ViewHandler viewHandler;
  private RegisterViewModel viewModel;
  @FXML MenuButton accType;
  @FXML TextField fmName;
  @FXML TextField lName;
  @FXML TextField id;
  @FXML TextField address;
  @FXML TextField dobD;
  @FXML TextField dobM;
  @FXML TextField dobY;
  @FXML TextField phone;
  @FXML Button registerButton;
  @FXML Button loginButton;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory, String username)
  {
    this.viewHandler=viewHandler;
    try
    {
      viewModel=viewModelFactory.getRegisterViewModel();
    }
    catch (RemoteException e)
    {
      e.printStackTrace();
    }
  }

  public void onLoginButton() throws IOException
  {
    viewHandler.openLoginView();
  }

  public void onRegisterButton()
  {
    String type = accType.getTypeSelector();
    String dob = dobD.getText()+"/"+dobM.getText()+"/"+dobY.getText();

    viewModel.signup(id.getText(),type,fmName.getText(),lName.getText(),address.getText(),dob,phone.getText());

    JOptionPane.showMessageDialog(null,"Request to signup has been sent and is awaiting approval");
    reset();
  }

  private void reset()
  {
    fmName.clear();
    lName.clear();
    id.clear();
    address.clear();
    dobD.clear();
    dobM.clear();
    dobY.clear();
    phone.clear();
  }
}
