package SharedResources.Networking.ServerSide;

import SharedResources.Networking.ClientSide.ClientCallBack;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface LoginServer extends Remote, Serializable
{
  void signup(String username, String password);
  void login(String username, String password);
  void logOut();
  void setClients(List<ClientCallBack> clients)throws RemoteException;
}
