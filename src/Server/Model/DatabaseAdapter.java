package Server.Model;

public interface DatabaseAdapter
{
  int loginQuery(String username, String password);
  int signupQuery(String username);
  void deposit(String amount,String cardNo,String cvv,String expDate);
  void withdraw(String amount,String cardNo,String cvv,String expDate);
  void requestInfoChange(String fmName,String lName,String username,String adress,String dobD,String dobM,String dobY,String phone);
  String getBalance();
  String getAccountNo();
  String getFullName(String username);
  String[] getInfo(String username);
}
