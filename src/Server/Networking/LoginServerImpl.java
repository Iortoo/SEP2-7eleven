package Server.Networking;

import Server.Model.LoginHandler;
import Server.Model.Model;
import Server.Model.ModelImpl;
import SharedResources.Networking.ClientSide.ClientCallBack;
import SharedResources.Networking.ServerSide.LoginServer;
import SharedResources.Utils.Request;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class LoginServerImpl implements LoginServer
{
  private static LoginServerImpl instance;
  private Model model;
  private List<ClientCallBack> clients;

  private LoginHandler loginHandler;

  public LoginServerImpl(LoginHandler loginHandler) throws RemoteException
  {
    this.loginHandler = loginHandler;
    this.model=ModelImpl.getInstance();
    UnicastRemoteObject.exportObject(this,0);
  }

  public Request login(String userId, String password) throws RemoteException
  {
    return loginHandler.login(userId, password);
  }



/*  public static LoginServerImpl getInstance() throws RemoteException
  {
    if(instance==null)instance=new LoginServerImpl(loginHandler);
    return instance;
  }*/

  public void signup(String username,String type, String fName, String lName, String address, String dob, String phone)throws RemoteException
  {
    model.signup(username,type,fName,lName,address,dob,phone);
  }

  public int Login(String username, String password) throws RemoteException
  {
    /*int result = model.getLogin(username,password);
    if(result==4) ServerImpl.getInstance().sendToEmployeeServer(clients);
    if(result==1) ServerImpl.getInstance().sendToCustomerServer(clients);
    return model.getLogin(username,password);*/
    return 0;
  }

  public void setClients(List<ClientCallBack> clients) throws RemoteException
  {
    this.clients=clients;
  }


}
