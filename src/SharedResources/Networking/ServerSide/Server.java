package SharedResources.Networking.ServerSide;

import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Server extends Remote
{
  LoginServer getLoginServer() throws RemoteException;
  void registerClient(ClientCallBack clientCallBack) throws RemoteException;
  void startServer() throws RemoteException, AlreadyBoundException;
}
