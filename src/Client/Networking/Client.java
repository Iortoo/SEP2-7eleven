package Client.Networking;

import SharedResources.Subject;
import SharedResources.Utils.Request;

import java.rmi.RemoteException;
import java.util.ArrayList;

public interface Client extends Subject
{
  void signup(String username,String type, String fName, String lName, String address, String dob, String phone);
  int Login(String username, String password);
  void employeeLogOut();
  void customerLogOut();
  void deposit(String username,String amount,String cardNo,String cvv,String expDate);
  String getBalance(String username);
  String getFullName(String username);
  void withdraw(String username,String amount,String cardNo,String cvv,String expDate);
  void requestInfoChange(String fmName,String lName,String username,String adress,String dobD,String dobM,String dobY,String phone);
  String[] getInfo(String username);
  void newAccount(String username,String type, String amount);
  int transfer(String username,String accountNo,String recAccNo,String recSwift,String amount);
  ArrayList<String> getRequests();
  void acceptRequest(String requestId);
  void denyRequest(String requestId);

  Request login(String userId, String password);
}
