package Server.Networking;

import Server.Model.Model;
import Server.Model.ModelImpl;
import SharedResources.Networking.ClientSide.ClientCallBack;
import SharedResources.Networking.ServerSide.EmployeeServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class EmployeeServerImpl implements EmployeeServer
{
  private static EmployeeServerImpl instance;
  private Model model;
  private List<ClientCallBack> clients;

  private EmployeeServerImpl() throws RemoteException
  {
    this.model= ModelImpl.getInstance();
    UnicastRemoteObject.exportObject(this,0);
  }

  public static EmployeeServerImpl getInstance() throws RemoteException
  {
    if(instance==null)instance=new EmployeeServerImpl();
    return instance;
  }

  public void setClients(List<ClientCallBack> clients) throws RemoteException
  {
    this.clients=clients;
  }

  public ArrayList<String> getRequests() throws RemoteException
  {
    return model.getRequests();
  }

  public void acceptRequest(String requestId) throws RemoteException
  {
    model.acceptRequest(requestId);
  }

  public void denyRequest(String requestId) throws RemoteException
  {
    model.denyRequest(requestId);
  }

  public void logout() throws RemoteException
  {
    ServerImpl.getInstance().sendToLoginServer(clients);
  }
}
