package Server.Model;

import SharedResources.Subject;

import java.io.Serializable;

public interface Model extends Subject, Serializable
{
  int getLogin(String username, String password);
  int getSignup(String username, String password);
  void deposit(String amount,String cardNo,String cvv,String expDate);
  void withdraw(String amount,String cardNo,String cvv, String expDate);
  void requestInfoChange(String fmName,String lName,String username,String adress,String dobD,String dobM,String dobY,String phone);
  String getBalance();
  String getAccountNo();
  String getFullName(String username);
  String[] getInfo(String username);

}
