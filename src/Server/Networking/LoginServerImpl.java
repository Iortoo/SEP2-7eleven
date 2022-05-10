package Server.Networking;

import Server.Model.Model;
import Server.Model.ModelImpl;
import SharedResources.Networking.ClientSide.ClientCallBack;
import SharedResources.Networking.ServerSide.LoginServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class LoginServerImpl implements LoginServer
{
  private Model model;
  private List<ClientCallBack> clients;

  public LoginServerImpl(Model model) throws RemoteException
  {
    this.model=model;
    UnicastRemoteObject.exportObject(this,0);
  }

  public int signup(String username, String password)
  {
    return model.getSignup(username, password);
  }

  public int login(String username, String password)
  {
    return model.getLogin(username,password);
  }

  public void logOut()
  {
    //log-out?
  }

  public void setClients(List<ClientCallBack> clients) throws RemoteException
  {
    this.clients=clients;
  }
}
