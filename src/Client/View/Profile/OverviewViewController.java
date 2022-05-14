package Client.View.Profile;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.beans.PropertyChangeEvent;
import java.io.IOException;

public class OverviewViewController implements ViewController
{
  private ViewHandler viewHandler;
  private OverviewViewModel viewModel;
  @FXML Button accountsButton;
  @FXML Button loanButton;
  @FXML Button profileButton;
  @FXML Button transfersButton;
  @FXML Button overviewButton;
  @FXML Button depositButton;
  @FXML Button withdrawButton;
  @FXML TextField balanceTextField;
  @FXML Label accountNoLabel;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory)
  {
    this.viewHandler = viewHandler;
    viewModel = viewModelFactory.getOverviewViewModel();
    update();
    viewModel.getModel().addListener("newBalance",this::newBalance);
    accountNoLabel.setText(accountNoLabel.getText()+" "+viewModel.getAccountNo());
  }

  public void onAccountsButton() throws IOException
  {
    // open view to accounts
  }

  public void onLoanButton() throws IOException
  {
    //open view to loan
  }

  public void onProfileButton() throws IOException
  {
    //open view to profile
  }

  public void onTransfersButton() throws IOException
  {
    //open view to transfers
  }

  public void onOverviewButton() throws IOException
  {
    //open view to overview
  }

  public void onDepositButton() throws IOException
  {
    viewHandler.openDepositView();
  }

  public void onWithdrawButton() throws IOException
  {
    viewHandler.openWithdrawalView();
  }

  public void newBalance(PropertyChangeEvent e)
  {
    update();
  }

  private void update()
  {
    balanceTextField.setText(viewModel.getBalance()+" DKK");
  }
}
