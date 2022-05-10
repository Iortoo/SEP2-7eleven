package Client.View.Profile;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class OverviewViewController implements ViewController
{
  private ViewHandler viewHandler;
  private OverviewViewModel viewModel;
  @FXML Button accountsButton;
  @FXML Button loanButton;
  @FXML Button profileButton;
  @FXML Button transfersButton;
  @FXML Button overviewButton;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory)
  {
    this.viewHandler = viewHandler;
    viewModel = viewModelFactory.getOverviewViewModel();
  }

  public void onAccountsButton()
  {
    // open view to accounts
  }

  public void onLoanButton()
  {
    //open view to loan
  }

  public void onProfileButton()
  {
    //open view to profile
  }

  public void onTransfersButton()
  {
    //open view to transfers
  }

  public void onOverviewButton()
  {
    //open view to overview
  }

}
