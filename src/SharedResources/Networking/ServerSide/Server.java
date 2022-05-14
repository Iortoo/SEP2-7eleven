package SharedResources.Networking.ServerSide;

import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import SharedResources.Networking.ClientSide.ClientCallBack;

public interface Server extends Remote
{
  LoginServer getLoginServer() throws RemoteException;
  CustomerServer getCustomerServer() throws RemoteException;
  EmployeeServer getEmployeeServer() throws RemoteException;
  void registerClient(ClientCallBack clientCallBack) throws RemoteException;
  void startServer() throws RemoteException, AlreadyBoundException;
}
