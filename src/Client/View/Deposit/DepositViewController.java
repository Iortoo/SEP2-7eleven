package Client.View.Deposit;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class DepositViewController implements ViewController
{
  @FXML TextField amountTextField;
  @FXML TextField cardNoTextField;
  @FXML TextField cvvTextField;
  @FXML TextField expMonthTextField;
  @FXML TextField expYearTextField;
  @FXML Button depositButton;
  @FXML Button overviewButton;
  @FXML Button transfersButton;
  @FXML Button profileButton;
  private ViewHandler viewHandler;
  private DepositViewModel viewModel;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory)
  {
    this.viewHandler = viewHandler;
    viewModel = viewModelFactory.getDepositViewModel();
  }

  public void onProfileButton() throws IOException
  {
    //viewHandler.openProfileView();
  }

  public void onTransfersButton() throws IOException
  {
    //viewHandler.openTransfersView();
  }

  public void onOverviewButton() throws IOException
  {
    viewHandler.openOverviewView();
  }

  public void onDepositButton() throws IOException
  {
    String amount = amountTextField.getText();
    String cardNo = cardNoTextField.getText();
    String cvv = cvvTextField.getText();
    String expDate = expMonthTextField + "/" + expYearTextField.getText();

    viewModel.deposit(amount,cardNo,cvv,expDate);
    viewHandler.openOverviewView();
  }
}
