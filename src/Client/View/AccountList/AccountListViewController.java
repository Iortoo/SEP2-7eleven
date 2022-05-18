package Client.View.AccountList;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import javax.swing.*;
import java.io.IOException;
import java.rmi.RemoteException;

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
    try
    {
      viewModel=viewModelFactory.getAccountListViewModel();
    }
    catch (RemoteException e)
    {
      e.printStackTrace();
    }
    addDummmyAccount();
    getAccounts();
  }

  private void addDummmyAccount()
  {
    // just for testing will be deleted later
    accountsListView.getItems().add("dummy account");
  }

  private void getAccounts()
  {
    //will add to the list all accounts from database
    //to be added
  }

  public void onProfileButton() throws IOException
  {
    viewHandler.openProfileView(username);
  }

  public void onSelectButton() throws IOException
  {
    if(accountsListView.getSelectionModel().isEmpty()) JOptionPane.showMessageDialog(null,"Select an account");
    else{
      String accountNo = (String)accountsListView.getSelectionModel().getSelectedItem();
      viewHandler.openOverviewView(username,accountNo);
    }
  }

  public void onNewAccountButton() throws IOException
  {
    viewHandler.openNewAccountView(username);
  }
}
