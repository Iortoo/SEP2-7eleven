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

  public void signup(String username,String type, String fName, String lName, String address, String dob, String phone)
  {
    DatabaseAdapterImpl.getInstance().signup(username,type,fName,lName,address,dob,phone);
  }

  public void deposit(String username,String amount,String cardNo,String cvv,String expDate)
  {
    DatabaseAdapterImpl.getInstance().deposit(username,amount,cardNo,cvv,expDate);
  }

  public void withdraw(String username,String amount,String cardNo,String cvv,String expDate)
  {
    DatabaseAdapterImpl.getInstance().withdraw(username,amount,cardNo,cvv,expDate);
  }

  public void requestInfoChange(String fmName,String lName,String username,String adress,String dobD,String dobM,String dobY,String phone)
  {
    DatabaseAdapterImpl.getInstance().requestInfoChange(fmName,lName,username,adress,dobD,dobM,dobY,phone);
  }

  public void newAccount(String username,String type, String amount)
  {
    DatabaseAdapterImpl.getInstance().newAccount(username,type,amount);
  }

  public String getBalance(String username)
  {
    return DatabaseAdapterImpl.getInstance().getBalance(username);
  }

  /*public String getAccountNo()
  {
    return DatabaseAdapterImpl.getInstance().getAccountNo();
  }*/

  public String getFullName(String username)
  {
    return DatabaseAdapterImpl.getInstance().getFullName(username);
  }

  public String[] getInfo(String username)
  {
    return DatabaseAdapterImpl.getInstance().getInfo(username);
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
