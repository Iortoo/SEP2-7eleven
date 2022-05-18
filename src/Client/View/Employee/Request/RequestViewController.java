package Client.View.Employee.Request;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.IOException;
import java.rmi.RemoteException;

public class RequestViewController implements ViewController
{
  private ViewHandler viewHandler;
  private RequestViewModel viewModel;
  private String username;
  private String requestId;
  @FXML Label usernameLabel;
  @FXML Label typeLabel;
  @FXML Label idLabel;
  @FXML Label nameLabel;
  @FXML TextField infoTextField;
  @FXML Button approveButton;
  @FXML Button denyButton;
  @FXML Button backButton;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory,
      String username)
  {
    this.viewHandler=viewHandler;
    this.username=username;
    try
    {
      viewModel=viewModelFactory.getRequestViewModel();
    }
    catch (RemoteException e)
    {
      e.printStackTrace();
    }
  }

  public void  initPlus(ViewHandler viewHandler,ViewModelFactory viewModelFactory,String username,String requestId)
  {
    init(viewHandler,viewModelFactory,username);
    this.requestId=requestId;
  }

  public void onApproveButton() throws IOException
  {
    viewModel.acceptRequest(requestId);
    JOptionPane.showMessageDialog(null,"Request accepted");
    viewHandler.openEmployeeOverviewView(username);
  }

  public void onDenyButton() throws IOException
  {
    viewModel.denyRequest(requestId);
    JOptionPane.showMessageDialog(null,"Request denied");
    viewHandler.openEmployeeOverviewView(username);
  }

  public void onBackButton() throws IOException
  {
    viewHandler.openEmployeeOverviewView(username);
  }
}
