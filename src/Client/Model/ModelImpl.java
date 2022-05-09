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
    client.addListener("accepted",this::acceptedCredentials);
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

  public void addListener(String event, PropertyChangeListener listener)
  {
    support.addPropertyChangeListener(event,listener);
  }

  public void removeListener(String event, PropertyChangeListener listener)
  {
    support.removePropertyChangeListener(event,listener);
  }

  private void acceptedCredentials(PropertyChangeEvent e)
  {
    support.firePropertyChange("accepted",null,true);
  }
}

