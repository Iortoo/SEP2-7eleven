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

  public void signup(String username, String password)
  {
    sendAcceptedCredentials(username,model.getSignup(username, password));
  }

  public void login(String username, String password)
  {
    sendAcceptedCredentials(username,model.getLogin(username,password));
  }

  private void sendAcceptedCredentials(String username, int validation)
  {
    // SEND THE VALUE TO THE RIGHT CLIENT
    // BASED ON USERNAME
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
