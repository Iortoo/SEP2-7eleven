package Server.Networking;

import Server.Model.Model;
import Server.Model.ModelImpl;
import SharedResources.Networking.ClientSide.ClientCallBack;
import SharedResources.Networking.ServerSide.CustomerServer;

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

  public void deposit(String amount,String cardNo,String cvv, String expDate)
  {
    model.deposit(amount,cardNo,cvv,expDate);
  }

  public void withdraw(String amount,String cardNo,String cvv, String expDate)
  {
    model.withdraw(amount,cardNo,cvv,expDate);
  }

  public String getBalance() throws RemoteException
  {
    return model.getBalance();
  }

  public String getAccountNo() throws RemoteException
  {
    return model.getAccountNo();
  }
}
