package Client.Model;

import SharedResources.Subject;
import SharedResources.Utils.Request;

import java.rmi.RemoteException;
import java.util.ArrayList;

public interface Model extends Subject
{
  Request login(String userId, String password);


  void signup(String username,String type, String fName, String lName, String address, String dob, String phone);
  void Login(String username, String password) throws RemoteException;
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
}
