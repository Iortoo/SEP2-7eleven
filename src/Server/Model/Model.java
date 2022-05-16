package Server.Model;

import SharedResources.Subject;

import java.io.Serializable;
import java.util.ArrayList;

public interface Model extends Subject, Serializable
{
  int getLogin(String username, String password);
  void signup(String username,String type, String fName, String lName, String address, String dob, String phone);
  void deposit(String username,String amount,String cardNo,String cvv,String expDate);
  void withdraw(String username,String amount,String cardNo,String cvv, String expDate);
  void requestInfoChange(String fmName,String lName,String username,String adress,String dobD,String dobM,String dobY,String phone);
  void newAccount(String username,String type, String amount);
  String getBalance(String username);
  String getFullName(String username);
  String[] getInfo(String username);
  int transfer(String username,String accountNo,String recAccNo,String recSwift,String amount);
  ArrayList<String> getRequests();
  void acceptRequest(String requestId);
  void denyRequest(String requestId);
}
