package SharedResources.Networking.ServerSide;

import SharedResources.Networking.ClientSide.ClientCallBack;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface CustomerServer extends Remote, Serializable
{
  void setClients(List<ClientCallBack> clients) throws RemoteException;
  void deposit(String username,String amount,String cardNo,String cvv,String expDate) throws RemoteException;
  void withdraw(String username,String amount,String cardNo,String cvv,String expDate) throws RemoteException;
  void requestInfoChange(String fmName,String lName,String username,String adress,String dobD,String dobM,String dobY,String phone)throws RemoteException;
  void newAccount(String username,String type, String amount)throws RemoteException;
  String[] getInfo(String username) throws RemoteException;
  String getBalance(String username) throws RemoteException;
  //String getAccountNo() throws RemoteException;
  String getFullName(String username) throws RemoteException;
}
