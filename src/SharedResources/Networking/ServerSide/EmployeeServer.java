package SharedResources.Networking.ServerSide;

import SharedResources.Networking.ClientSide.ClientCallBack;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface EmployeeServer extends Remote, Serializable
{
  void setClients(List<ClientCallBack> clients) throws RemoteException;
}
