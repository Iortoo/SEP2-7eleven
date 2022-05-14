package Client.Model;

import SharedResources.Subject;

import java.beans.PropertyChangeEvent;

public interface Model extends Subject
{
  void signup(String username, String password);
  void login(String username, String password);
  void logout();
  void deposit(String amount,String cardNo,String cvv,String expDate);
  String getBalance();
  String getAccountNo();
  void withdraw(String amount,String cardNo,String cvv,String expDate);
}
