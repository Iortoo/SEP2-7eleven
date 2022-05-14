package Server.Model;

public interface DatabaseAdapter
{
  int loginQuery(String username, String password);
  int signupQuery(String username);
  void deposit(String amount,String cardNo,String cvv,String expDate);
  void withdraw(String amount,String cardNo,String cvv,String expDate);
  String getBalance();
  String getAccountNo();
}
