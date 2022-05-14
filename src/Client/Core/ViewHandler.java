package Client.Core;

import Client.View.AccountList.AccountListViewController;
import Client.View.Deposit.DepositViewController;
import Client.View.Login.LoginViewController;
import Client.View.NewAccount.NewAccountViewController;
import Client.View.Overview.OverviewViewController;
import Client.View.Profile.ProfileViewController;
import Client.View.Profile.ProfileViewModel;
import Client.View.ProfileInfo.ProfileInfoViewController;
import Client.View.Register.RegisterViewController;
import Client.View.Withdrawal.WithdrawalViewController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewHandler
{

  private Stage stage;
  private ViewModelFactory viewModelFactory;

  public ViewHandler(Stage stage, ViewModelFactory viewModelFactory)
  {
    this.stage=stage;
    this.viewModelFactory=viewModelFactory;
  }

  public void openLoginView() throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("../View/Login/LoginView.fxml"));
    root = loader.load();
    LoginViewController controller = loader.getController();
    controller.init(this,viewModelFactory,"");
    scene = new Scene(root);
    stage.setTitle("Log In");
    stage.setScene(scene);
    stage.show();
  }

  public void openOverviewView(String username,String accountNo) throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("../View/Overview/OverviewView.fxml"));
    root = loader.load();
    OverviewViewController controller = loader.getController();
    controller.initPlus(this,viewModelFactory,username,accountNo);
    scene = new Scene(root);
    stage.setTitle("Overview");
    stage.setScene(scene);
    stage.show();
  }

  public void openDepositView(String username,String accountNo) throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("../View/Deposit/DepositView.fxml"));
    root = loader.load();
    DepositViewController controller = loader.getController();
    controller.initPlus(this,viewModelFactory,username,accountNo);
    scene = new Scene(root);
    stage.setTitle("Deposit");
    stage.setScene(scene);
    stage.show();
  }

  public void openWithdrawalView(String username,String accountNo) throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("../View/Withdrawal/WithdrawalView.fxml"));
    root = loader.load();
    WithdrawalViewController controller = loader.getController();
    controller.initPlus(this,viewModelFactory,username,accountNo);
    scene = new Scene(root);
    stage.setTitle("Withdrawal");
    stage.setScene(scene);
    stage.show();
  }

  public void openProfileView(String username) throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("../View/Profile/ProfileView.fxml"));
    root = loader.load();
    ProfileViewController controller = loader.getController();
    controller.init(this,viewModelFactory,username);
    scene = new Scene(root);
    stage.setTitle("Profile");
    stage.setScene(scene);
    stage.show();
  }

  public void openAccountListView(String username) throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("../View/AccountList/AccountListView.fxml"));
    root = loader.load();
    AccountListViewController controller = loader.getController();
    controller.init(this,viewModelFactory,username);
    scene = new Scene(root);
    stage.setTitle("Account list");
    stage.setScene(scene);
    stage.show();
  }

  public void openProfileInfoView(String username) throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("../View/ProfileInfo/ProfileInfoView.fxml"));
    root = loader.load();
    ProfileInfoViewController controller = loader.getController();
    controller.init(this,viewModelFactory,username);
    scene = new Scene(root);
    stage.setTitle("Profile info");
    stage.setScene(scene);
    stage.show();
  }

  public void openNewAccountView(String username) throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("../View/NewAccount/NewAccountView.fxml"));
    root = loader.load();
    NewAccountViewController controller = loader.getController();
    controller.init(this,viewModelFactory,username);
    scene = new Scene(root);
    stage.setTitle("Open new account");
    stage.setScene(scene);
    stage.show();
  }

  public void openRegisterView() throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("../View/Register/RegisterView.fxml"));
    root = loader.load();
    RegisterViewController controller = loader.getController();
    controller.init(this,viewModelFactory,"");
    scene = new Scene(root);
    stage.setTitle("Sign up");
    stage.setScene(scene);
    stage.show();
  }
}
