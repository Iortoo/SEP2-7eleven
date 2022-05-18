package SharedResources.Networking.ServerSide;

import SharedResources.Networking.ClientSide.ClientCallBack;
import SharedResources.Utils.Request;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface LoginServer extends Remote, Serializable
{
  void signup(String username,String type, String fName, String lName, String address, String dob, String phone)throws RemoteException;
  int Login(String username, String password) throws  RemoteException;
  void setClients(List<ClientCallBack> clients)throws RemoteException;

  Request login(String username, String password) throws RemoteException;
}
