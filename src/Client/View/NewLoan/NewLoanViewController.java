package Client.View.NewLoan;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;

public class NewLoanViewController implements ViewController
{
  private ViewHandler viewHandler;
  private NewLoanViewModel viewModel;
  private String username;
  private String accountNo;
  @FXML TextField amountTextField;
  @FXML TextField interestRateTextField;
  @FXML MenuButton tenureMenuButton;
  @FXML TextField totalPaybackTextField;
  @FXML Button requestButton;
  @FXML Button overviewButton;
  @FXML Button transfersButton;
  @FXML Button profileButton;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory, String username)
  {

  }
  public void initPlus(ViewHandler viewHandler,ViewModelFactory viewModelFactory,String username,String accountNo)
  {

  }
}
