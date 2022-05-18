package Client.Core;

import Client.Model.Model;
import Client.Model.ModelImpl;

import java.rmi.RemoteException;

public class ModelFactory
{
  private ClientFactory clientFactory;
  private Model model;

  public ModelFactory(ClientFactory clientFactory)
  {
    this.clientFactory=clientFactory;
  }

  public Model getModel() throws RemoteException
  {
    if(model==null)model=new ModelImpl(clientFactory.getClient());
    return model;
  }
}
