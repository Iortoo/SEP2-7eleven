package Client.View.Transfers;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;

import java.io.IOException;

public class TransfersViewController implements ViewController
{
  private ViewHandler viewHandler;
  private TransfersViewModel viewModel;
  private String username;
  private String accountNo;
  @FXML ScrollPane historyScrollPane;
  @FXML Button makeTransferButton;
  @FXML Button profileButton;
  @FXML Button overviewButton;
  @FXML Button accountsButton;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory, String username)
  {
    this.username=username;
    this.viewHandler=viewHandler;
    viewModel=viewModelFactory.getTransfersViewModel();
    historyScrollPane.getContent().setAccessibleText("AAAAAAAAA\nAAAAAAAAAAA");
  }

  public void initPlus(ViewHandler viewHandler, ViewModelFactory viewModelFactory, String username,String accountNo)
  {
    init(viewHandler,viewModelFactory,username);
    this.accountNo=accountNo;
  }

  public void onMakeTransferButton() throws IOException
  {
    viewHandler.openMakeTransferView(username,accountNo);
  }

  public void onAccountsButton() throws IOException
  {
    viewHandler.openAccountListView(username);
  }

  public void onProfileButton() throws IOException
  {
    viewHandler.openProfileView(username);
  }

  public void onOverviewButton() throws IOException
  {
    viewHandler.openOverviewView(username,accountNo);
  }
}
