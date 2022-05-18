package Client.View.Withdrawal;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.Deposit.DepositViewModel;
import Client.View.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.IOException;
import java.rmi.RemoteException;

public class WithdrawalViewController implements ViewController
{
  @FXML TextField amountTextField;
  @FXML TextField cardNoTextField;
  @FXML TextField cvvTextField;
  @FXML TextField expMonthTextField;
  @FXML TextField expYearTextField;
  @FXML Button withdrawButton;
  @FXML Button overviewButton;
  @FXML Button transfersButton;
  @FXML Button profileButton;
  private ViewHandler viewHandler;
  private WithdrawalViewModel viewModel;
  private String username;
  private String accountNo;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory,String username)
  {
    this.username=username;
    this.viewHandler = viewHandler;
    try
    {
      viewModel = viewModelFactory.getWithdrawalViewModel();
    }
    catch (RemoteException e)
    {
      e.printStackTrace();
    }
  }

  public void initPlus(ViewHandler viewHandler,ViewModelFactory viewModelFactory,String username,String accountNo)
  {
    init(viewHandler,viewModelFactory,username);
    this.accountNo=accountNo;
  }

  public void onProfileButton() throws IOException
  {
    viewHandler.openProfileView(username);
  }

  public void onTransfersButton() throws IOException
  {
    viewHandler.openTransfersView(username,accountNo);
  }

  public void onOverviewButton() throws IOException
  {
    viewHandler.openOverviewView(username,accountNo);
  }

  public void onWithdrawalButton() throws IOException
  {
    String amount = amountTextField.getText();
    String cardNo = cardNoTextField.getText();
    String cvv = cvvTextField.getText();
    String expDate = expMonthTextField.getText() + "/" + expYearTextField.getText();

    if(amount!=null && cardNo!=null && cvv!=null && !expDate.equals("/"))
    {
      viewModel.withdraw(username,amount,cardNo,cvv,expDate);
      viewHandler.openOverviewView(username,accountNo);
    }
    else JOptionPane.showMessageDialog(null,"Please fill in all fields");
  }
}
