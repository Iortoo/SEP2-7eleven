package Server;

import Server.Model.LoginHandler;
import Server.Model.LoginHandlerImpl;
import Server.Model.ModelImpl;
import Server.Networking.LoginServerImpl;
import Server.Networking.ServerImpl;
import SharedResources.Networking.ServerSide.LoginServer;
import SharedResources.Networking.ServerSide.Server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;

public class RunServer
{
  public static void main(String[] args)
      throws RemoteException, AlreadyBoundException, SQLException
  {
    LoginHandler loginHandler = new LoginHandlerImpl();
    LoginServer loginServer = new LoginServerImpl(loginHandler);
    Server server = new ServerImpl(loginServer);
    server.startServer();
  }
}
