package Client.View.Login;

import Client.Core.ViewHandler;
import Client.Model.Model;
import Client.Model.ModelImpl;
import javafx.beans.Observable;
import javafx.beans.value.ObservableIntegerValue;
import javafx.collections.FXCollections;

import java.beans.PropertyChangeEvent;
import java.io.IOException;

public class LoginViewModel
{
  private Model model;
  private ViewHandler viewHandler;

  public LoginViewModel(Model model)
  {
    this.model = model;
  }

  public void login(String username, String password)
  {
    model.login(username,password);
  }

  public Model getModel()
  {
    return model;
  }
}
