package Client.View.NewAccount;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;

import java.io.IOError;
import java.io.IOException;
import java.rmi.RemoteException;

public class NewAccountViewController implements ViewController
{
  private String username;
  private ViewHandler viewHandler;
  private NewAccountViewModel viewModel;
  @FXML MenuButton accountType;
  @FXML TextField amount;
  @FXML Button registerButton;
  @FXML Button accountsButton;
  @FXML Button profileButton;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory,
      String username)
  {
    this.username=username;
    this.viewHandler=viewHandler;
    try
    {
      viewModel=viewModelFactory.getNewAccountViewModel();
    }
    catch (RemoteException e)
    {
      e.printStackTrace();
    }
  }

  public void onRegisterButton() throws IOException
  {
    String type ="";// accountType. FIGURE THIS OUT
    String deposit = amount.getText();

    viewModel.newAccount(username,type,deposit);
    viewHandler.openAccountListView(username);
  }

  public void onAccountsButton() throws IOException
  {
    viewHandler.openAccountListView(username);
  }

  public void onProfileButton() throws IOException
  {
    viewHandler.openProfileView(username);
  }
}
