package Client.View;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;

import java.rmi.RemoteException;

public interface ViewController
{
  void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory,String username)
      throws RemoteException;
}
