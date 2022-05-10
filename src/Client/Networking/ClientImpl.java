package Client.Networking;

import SharedResources.Networking.ClientSide.ClientCallBack;
import SharedResources.Networking.ServerSide.Server;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ClientImpl implements Client, ClientCallBack
{
  private Server server;
  private PropertyChangeSupport support;

  public ClientImpl()
  {
    try{
      UnicastRemoteObject.exportObject(this,0);
      Registry registry = LocateRegistry.getRegistry(1099);
      server = (Server)registry.lookup("Server");
      support = new PropertyChangeSupport(this);
      server.registerClient(this);
    }
    catch (RemoteException e){System.out.println(e.getMessage());}
    catch(NotBoundException e){}
  }

  public void signup(String username, String password)
  {
    int validation=-1;
    try{
      validation=server.getLoginServer().signup(username, password);
    }
    catch(RemoteException e){}
    support.firePropertyChange("validation",null,validation);
  }

  public void login(String username, String password)
  {
    int validation=-1;
    try{
      validation = server.getLoginServer().login(username, password);
    }
    catch(RemoteException e){}
    System.out.println(validation);
    support.firePropertyChange("validation",null,validation);
  }

  public void logout()
  {
    try{
      server.getLoginServer().logOut();
    }
    catch (RemoteException e){};
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
