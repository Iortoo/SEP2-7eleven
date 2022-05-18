package Client.Core;
import Client.Networking.Client;
import Client.Networking.ClientImpl;

import java.rmi.RemoteException;

public class ClientFactory
{

  private Client client;

  public Client getClient() throws RemoteException
  {
    if(client==null)client = new ClientImpl();
    return client;
  }
}

