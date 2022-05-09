package Server.Model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ModelImpl implements Model
{
  private PropertyChangeSupport support;

  public boolean getLogin(String username, String password)
  {
    // if the username and password match
    // an existing on in  the database
    // return true and call the method
    // sendAcceptCredentials()
    return false;
  }

  public boolean getSignup(String username, String password)
  {
    // if the username is not in the database
    // return true and call method
    // sendAcceptCredentials()
    return true;
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
