package Server.Networking;

import Server.Model.Model;
import Server.Model.ModelImpl;
import SharedResources.Networking.ClientSide.ClientCallBack;
import SharedResources.Networking.ServerSide.CustomerServer;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class CustomerServerImpl implements CustomerServer
{
  private static CustomerServerImpl instance;
  private Model model;
  private List<ClientCallBack> clients;

  private CustomerServerImpl() throws RemoteException
  {
    this.model = ModelImpl.getInstance();
    UnicastRemoteObject.exportObject(this,0);
  }

  public static CustomerServerImpl getInstance() throws RemoteException
  {
    if(instance==null)instance=new CustomerServerImpl();
    return instance;
  }

  public void setClients(List<ClientCallBack> clients)
  {
    this.clients=clients;
  }

  public void deposit(String username,String amount,String cardNo,String cvv, String expDate)
  {
    model.deposit(username,amount,cardNo,cvv,expDate);
  }

  public void withdraw(String username,String amount,String cardNo,String cvv, String expDate)
  {
    model.withdraw(username,amount,cardNo,cvv,expDate);
  }

  public void requestInfoChange(String fmName,String lName,String username,String adress,String dobD,String dobM,String dobY,String phone)throws RemoteException
  {
    model.requestInfoChange(fmName,lName,username,adress,dobD,dobM,dobY,phone);
  }

  public void newAccount(String username,String type, String amount)throws RemoteException
  {
    model.newAccount(username,type,amount);
  }

  public String getBalance(String username) throws RemoteException
  {
    return model.getBalance(username);
  }

  public int transfer(String username,String accountNo,String recAccNo,String recSwift,String amount)throws RemoteException
  {
    return model.transfer(username,accountNo,recAccNo,recSwift,amount);
  }

  public String getFullName(String username) throws RemoteException
  {
    return model.getFullName(username);
  }
  public String[] getInfo(String username) throws RemoteException
  {
    return model.getInfo(username);
  }
}
