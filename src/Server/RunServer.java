package Server;

import Server.Model.ModelImpl;
import Server.Networking.LoginServerImpl;
import Server.Networking.ServerImpl;
import SharedResources.Networking.ServerSide.LoginServer;
import SharedResources.Networking.ServerSide.Server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;

public class RunServer
{
  public static void main(String[] args) throws RemoteException, AlreadyBoundException
  {
    Server server = ServerImpl.getInstance();
    server.startServer();
  }
}
