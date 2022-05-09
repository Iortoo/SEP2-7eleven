package Server.Networking;

import SharedResources.Networking.ClientSide.ClientCallBack;
import SharedResources.Networking.ServerSide.LoginServer;
import SharedResources.Networking.ServerSide.Server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ServerImpl implements Server
{
  private LoginServer loginServer;
  private List<ClientCallBack> clients;

  public ServerImpl(LoginServer loginServer) throws RemoteException
  {
    this.loginServer=loginServer;
    UnicastRemoteObject.exportObject(this,0);
    clients = new ArrayList<>();
  }

  public LoginServer getLoginServer() throws RemoteException
  {
    return loginServer;
  }

  public void registerClient(ClientCallBack clientCallBack)
      throws RemoteException
  {
    clients.add(clientCallBack);
    sendToLoginServer(clients);
    System.out.println("CLIENT ADDED");
  }

  public void startServer() throws RemoteException, AlreadyBoundException
  {
    Registry registry = LocateRegistry.createRegistry(1099);
    registry.bind("Server",this);
    System.out.println("SERVER STARTED");
  }

  public void sendToLoginServer(List<ClientCallBack> clients) throws RemoteException
  {
    loginServer.setClients(clients);
  }
}
