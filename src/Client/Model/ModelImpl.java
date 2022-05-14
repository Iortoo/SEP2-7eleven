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

  public void signup(String username, String password)
  {
    client.signup(username,password);
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

  public void deposit(String amount,String cardNo,String cvv,String expDate)
  {
    client.deposit(amount,cardNo,cvv,expDate);
  }

  public String getBalance()
  {
    return client.getBalance();
  }

  public String getAccountNo(){return client.getAccountNo();}

  public void withdraw(String amount,String cardNo,String cvv,String expDate)
  {
    client.withdraw(amount,cardNo,cvv,expDate);
  }

  private void newBalance(PropertyChangeEvent e)
  {
    support.firePropertyChange("newBalance",null,"newBalance");
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

