package Client.Networking;

import SharedResources.Networking.ClientSide.ClientCallBack;
import SharedResources.Networking.ServerSide.Server;
import SharedResources.Utils.Request;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ClientImpl implements Client, ClientCallBack
{
  private Server server;
  private PropertyChangeSupport support;

  public ClientImpl() throws RemoteException
  {
    try{
      UnicastRemoteObject.exportObject(this,0);
      Registry registry = LocateRegistry.getRegistry(1099);
      server = (Server)registry.lookup("Server");
      support = new PropertyChangeSupport(this);
      server.registerClient(this);
    }
    catch (RemoteException e){System.out.println(e.getMessage());}
    catch(NotBoundException e){}
  }

  public void signup(String username,String type, String fName, String lName, String address, String dob, String phone)
  {
    try{
      server.getLoginServer().signup(username,type,fName,lName,address,dob,phone);
    }catch(RemoteException e){}
  }

  @Override public int Login(String username, String password)
  {
    /*int validation=-1;
    try{
      validation = server.getLoginServer().login(username, password);
    }
    catch(RemoteException e){}
    System.out.println(validation);
    support.firePropertyChange("validation",null,validation);*/
    return 0;
  }

  public void employeeLogOut()
  {
    try{
      server.getEmployeeServer().logout();
    }
    catch (RemoteException e){};
  }

  public void customerLogOut()
  {
    try{
      server.getCustomerServer().logout();
    }
    catch (RemoteException e){};
  }

  public void deposit(String username,String amount,String cardNo,String cvv,String expDate)
  {
    try{
      server.getCustomerServer().deposit(username,amount,cardNo,cvv,expDate);
      support.firePropertyChange("newBalance",null,"newBalance");
    }
    catch(RemoteException e){}

  }

  public void withdraw(String username,String amount,String cardNo,String cvv,String expDate)
  {
    try{
      server.getCustomerServer().withdraw(username,amount,cardNo,cvv,expDate);
      support.firePropertyChange("newBalance",null,"newBalance");
    }catch(RemoteException e){};
  }

  public String getBalance(String username)
  {
    String rtrn="1";
    try{
      rtrn=server.getCustomerServer().getBalance(username);
    }catch(RemoteException e){}
    return rtrn;
  }

  public int transfer(String username,String accountNo,String recAccNo,String recSwift,String amount)
  {
    int rtrn=0;
    try{
      rtrn=server.getCustomerServer().transfer(username,accountNo,recAccNo,recSwift,amount);
    }catch (RemoteException e){}
    return rtrn;
  }

  public String getFullName(String username)
  {
    String rtrn="Bob Bobson";
    try{
      rtrn=server.getCustomerServer().getFullName(username);
    }catch(RemoteException e){}
    return rtrn;
  }

  public void requestInfoChange(String fmName,String lName,String username,String adress,String dobD,String dobM,String dobY,String phone)
  {
    try{
      server.getCustomerServer().requestInfoChange(fmName,lName,username,adress,dobD,dobM,dobY,phone);
    }catch(RemoteException e){}
  }

  public String[] getInfo(String username)
  {
    String[] rtrn ={"","","","","","","",""};
    try{
      rtrn =server.getCustomerServer().getInfo(username);
    }catch(RemoteException e){}
    return rtrn;
  }

  public void newAccount(String username,String type, String amount)
  {
    try{
      server.getCustomerServer().newAccount(username,type,amount);
    }catch(RemoteException e){}
  }

  public ArrayList<String> getRequests()
  {
    ArrayList<String> rtrn=new ArrayList<>();
    try{
      rtrn = server.getEmployeeServer().getRequests();
    }catch(RemoteException e){}
    return rtrn;
  }

  public void acceptRequest(String requestId)
  {
    try{
      server.getEmployeeServer().acceptRequest(requestId);
    }catch(RemoteException e){}
  }

  public void denyRequest(String requestId)
  {
    try{
      server.getEmployeeServer().denyRequest(requestId);
    }catch(RemoteException e){}
  }

  public void addListener(String event, PropertyChangeListener listener)
  {
    support.addPropertyChangeListener(event,listener);
  }

  public void removeListener(String event, PropertyChangeListener listener)
  {
    support.removePropertyChangeListener(event,listener);
  }


  public Request login(String userId, String password)
  {
    try
    {
      return server.getLoginServer().login(userId, password);
    }
    catch (RemoteException e)
    {
      return new Request(e.getMessage(),null);
    }
  }
}
