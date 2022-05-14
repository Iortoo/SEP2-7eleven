package Server.Model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ModelImpl implements Model
{
  private static Model instance;
  private PropertyChangeSupport support;

  private ModelImpl()
  {
    support = new PropertyChangeSupport(this);
  }

  public static Model getInstance()
  {
    if(instance == null) instance = new ModelImpl();
    return instance;
  }

  public int getLogin(String username, String password)
  {
    // 1 if credentials are valide
    // 0 if password is wrong
    // 2 if username is not in database
    // 3 if the username and password params are null
    // for now it returns 1
    int result = DatabaseAdapterImpl.getInstance().loginQuery(username,password);

    return result;
  }

  public int getSignup(String username, String password)
  {
    // if the username is not in the database
    // return true and call method
    // sendAcceptCredentials()

    // 1 if credentials are valid
    // 0 if the username is in the database already

    int result = DatabaseAdapterImpl.getInstance().signupQuery(username);
    return result;
  }

  public void deposit(String amount,String cardNo,String cvv,String expDate)
  {
    DatabaseAdapterImpl.getInstance().deposit(amount,cardNo,cvv,expDate);
  }

  public void withdraw(String amount,String cardNo,String cvv,String expDate)
  {
    DatabaseAdapterImpl.getInstance().withdraw(amount,cardNo,cvv,expDate);
  }

  public String getBalance()
  {
    return DatabaseAdapterImpl.getInstance().getBalance();
  }

  public String getAccountNo()
  {
    return DatabaseAdapterImpl.getInstance().getAccountNo();
  }

  public void addListener(String event, PropertyChangeListener listener)
  {
    support.addPropertyChangeListener(event,listener);
  }

  public void removeListener(String event, PropertyChangeListener listener)
  {
    support.addPropertyChangeListener(event,listener);
  }
}
