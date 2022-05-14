package Client.Core;

import Client.View.Deposit.DepositViewController;
import Client.View.Login.LoginViewController;
import Client.View.Profile.OverviewViewController;
import Client.View.Withdrawal.WithdrawalViewController;
import Client.View.Withdrawal.WithdrawalViewModel;
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
    controller.init(this,viewModelFactory);
    scene = new Scene(root);
    stage.setTitle("Log In");
    stage.setScene(scene);
    stage.show();
  }

  public void openOverviewView() throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("../View/Profile/OverviewView.fxml"));
    root = loader.load();
    OverviewViewController controller = loader.getController();
    controller.init(this,viewModelFactory);
    scene = new Scene(root);
    stage.setTitle("Overview");
    stage.setScene(scene);
    stage.show();
  }

  public void openDepositView() throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("../View/Deposit/DepositView.fxml"));
    root = loader.load();
    DepositViewController controller = loader.getController();
    controller.init(this,viewModelFactory);
    scene = new Scene(root);
    stage.setTitle("Deposit");
    stage.setScene(scene);
    stage.show();
  }

  public void openWithdrawalView() throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("../View/Withdrawal/WithdrawalView.fxml"));
    root = loader.load();
    WithdrawalViewController controller = loader.getController();
    controller.init(this,viewModelFactory);
    scene = new Scene(root);
    stage.setTitle("Withdrawal");
    stage.setScene(scene);
    stage.show();
  }
}
