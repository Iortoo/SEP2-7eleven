package Client.View.AccountList;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.io.IOException;

public class AccountListViewController implements ViewController
{
  @FXML ListView accountsListView;
  @FXML Button profileButton;
  @FXML Button selectButton;
  @FXML Button newAccountButton;
  private String username;
  private ViewHandler viewHandler;
  private AccountListViewModel viewModel;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory, String username)
  {
    this.username=username;
    this.viewHandler=viewHandler;
    viewModel=viewModelFactory.getAccountListViewModel();
    addDummmyAccount();
  }

  private void addDummmyAccount()
  {
    // just for testing will be deleted later
    accountsListView.getItems().add("dummy account");
  }

  public void onProfileButton() throws IOException
  {
    viewHandler.openProfileView(username);
  }

  public void onSelectButton() throws IOException
  {
    String accountNo = (String)accountsListView.getSelectionModel().getSelectedItem();
    viewHandler.openOverviewView(username,accountNo);
  }

  public void onNewAccountButton() throws IOException
  {
    viewHandler.openNewAccountView(username);
  }
}
