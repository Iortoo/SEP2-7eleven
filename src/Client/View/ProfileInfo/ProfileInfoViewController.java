package Client.View.ProfileInfo;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.Profile.ProfileViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ProfileInfoViewController
{
  private ViewHandler viewHandler;
  private ProfileInfoViewModel viewModel;
  private String username;
  @FXML TextField fmName;
  @FXML TextField lName;
  @FXML TextField id;
  @FXML TextField address;
  @FXML TextField dobDay;
  @FXML TextField dobYear;
  @FXML TextField dobMonth;
  @FXML TextField phone;
  @FXML Button requestButton;
  @FXML Button accountsButton;
  @FXML Button profileButton;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory,String username)
  {
    this.username=username;
    this.viewHandler=viewHandler;
    viewModel=viewModelFactory.getProfileInfoViewModel();
    String[] array = viewModel.getInfo(username);
    fmName.setText(array[0]);
    lName.setText(array[1]);
    id.setText(username);
    address.setText(array[3]);
    dobDay.setText(array[4]);
    dobMonth.setText(array[5]);
    dobYear.setText(array[6]);
    phone.setText(array[7]);
  }

  public void onRequestButton()
  {
    viewModel.requestInfoChange(fmName.getText(),lName.getText(),id.getText(),address.getText(),dobDay.getText(),dobMonth.getText(),dobYear.getText(),phone.getText());
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
