package Server.Model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ModelImpl implements Model
{
  private PropertyChangeSupport support;

  public ModelImpl()
  {
    support = new PropertyChangeSupport(this);
  }

  public int getLogin(String username, String password)
  {
    // if the username and password match
    // an existing on in  the database
    // return true and call the method
    // sendAcceptCredentials()

    // 1 if credentials are valid
    // 0 if password is incorrect
    // 2 if username does not exist in the database
    // below I use a dummy username and password to test functionality

    if(username.equals("DummyUsername"))
    {
      if(password.equals("dummypassword")) return 1;
      else return 0;
    }
    return 2;
  }

  public int getSignup(String username, String password)
  {
    // if the username is not in the database
    // return true and call method
    // sendAcceptCredentials()

    // 1 if credentials are valid
    // 0 if the username is in the database already
    // bellow I use a dummy username to test functionality
    if(username.equals("DummyUsername")) return 1;
    return 0;
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
