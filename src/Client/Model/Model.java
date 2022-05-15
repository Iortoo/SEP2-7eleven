package Client.Model;

import SharedResources.Subject;

import java.beans.PropertyChangeEvent;

public interface Model extends Subject
{
  void signup(String username,String type, String fName, String lName, String address, String dob, String phone);
  void login(String username, String password);
  void logout();
  void deposit(String username,String amount,String cardNo,String cvv,String expDate);
  String getBalance(String username);
  String getFullName(String username);
  void withdraw(String username,String amount,String cardNo,String cvv,String expDate);
  void requestInfoChange(String fmName,String lName,String username,String adress,String dobD,String dobM,String dobY,String phone);
  String[] getInfo(String username);
  void newAccount(String username,String type, String amount);
  int transfer(String username,String accountNo,String recAccNo,String recSwift,String amount);

}
