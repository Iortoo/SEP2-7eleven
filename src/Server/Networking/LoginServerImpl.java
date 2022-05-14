package Server.Networking;

import Server.Model.Model;
import Server.Model.ModelImpl;
import SharedResources.Networking.ClientSide.ClientCallBack;
import SharedResources.Networking.ServerSide.LoginServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class LoginServerImpl implements LoginServer
{
  private static LoginServerImpl instance;
  private Model model;
  private List<ClientCallBack> clients;

  private LoginServerImpl() throws RemoteException
  {
    this.model=ModelImpl.getInstance();
    UnicastRemoteObject.exportObject(this,0);
  }

  public static LoginServerImpl getInstance() throws RemoteException
  {
    if(instance==null)instance=new LoginServerImpl();
    return instance;
  }

  public void signup(String username,String type, String fName, String lName, String address, String dob, String phone)throws RemoteException
  {
    model.signup(username,type,fName,lName,address,dob,phone);
  }

  public int login(String username, String password) throws RemoteException
  {
    int result = model.getLogin(username,password);
    if(result==4) ServerImpl.getInstance().sendToEmployeeServer(clients);
    if(result==1) ServerImpl.getInstance().sendToCustomerServer(clients);
    return model.getLogin(username,password);
  }

  public void logOut()
  {
    //log-out?
  }

  public void setClients(List<ClientCallBack> clients) throws RemoteException
  {
    this.clients=clients;
  }
}
