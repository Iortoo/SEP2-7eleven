package Client.Networking;

import SharedResources.Subject;

public interface Client extends Subject
{
  void signup(String username, String password);
  void login(String username, String password);
  void logout();
  void deposit(String amount,String cardNo,String cvv,String expDate);
  String getBalance();
  String getAccountNo();
  String getFullName(String username);
  void withdraw(String amount,String cardNo,String cvv,String expDate);
  void requestInfoChange(String fmName,String lName,String username,String adress,String dobD,String dobM,String dobY,String phone);
  String[] getInfo(String username);

}
