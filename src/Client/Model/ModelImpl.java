package Client.Model;

import Client.Networking.Client;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ModelImpl implements Model
{
  private Client client;
  private PropertyChangeSupport support;

  public ModelImpl(Client client)
  {
    this.client=client;
    support = new PropertyChangeSupport(this);
    client.addListener("validation",this::validation);
    client.addListener("newBalance",this::newBalance);
  }

  public void signup(String username,String type, String fName, String lName, String address, String dob, String phone)
  {
    client.signup(username,type,fName,lName,address,dob,phone);
  }

  public void login(String username, String password)
  {
    client.login(username,password);
  }

  public void logout()
  {
    client.logout();
  }

  private void validation(PropertyChangeEvent e)
  {
    support.firePropertyChange("validation",null,e.getNewValue());
  }

  public void deposit(String username,String amount,String cardNo,String cvv,String expDate)
  {
    client.deposit(username,amount,cardNo,cvv,expDate);
  }

  public String getBalance(String username)
  {
    return client.getBalance(username);
  }

  //public String getAccountNo(){return client.getAccountNo();}

  public String getFullName(String username)
  {
    return client.getFullName(username);
  }

  public void withdraw(String username,String amount,String cardNo,String cvv,String expDate)
  {
    client.withdraw(username,amount,cardNo,cvv,expDate);
  }

  private void newBalance(PropertyChangeEvent e)
  {
    support.firePropertyChange("newBalance",null,"newBalance");
  }

  public void requestInfoChange(String fmName,String lName,String username,String adress,String dobD,String dobM,String dobY,String phone)
  {
    client.requestInfoChange(fmName,lName,username,adress,dobD,dobM,dobY,phone);
  }

  public String[] getInfo(String username)
  {
    return client.getInfo(username);
  }

  public void newAccount(String username,String type, String amount)
  {
    client.newAccount(username,type,amount);
  }

  public int transfer(String username,String accountNo,String recAccNo,String recSwift,String amount)
  {
    return client.transfer(username,accountNo,recAccNo,recSwift,amount);
  }

  public void addListener(String event, PropertyChangeListener listener)
  {
    support.addPropertyChangeListener(event,listener);
  }

  public void removeListener(String event, PropertyChangeListener listener)
  {
    support.removePropertyChangeListener(event,listener);
  }
}

