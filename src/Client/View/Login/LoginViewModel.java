package Client.View.Login;

import Client.Model.Model;
import Client.Model.ModelImpl;

public class LoginViewModel
{
  private Model model;

  public LoginViewModel(Model model)
  {
    this.model = model;
    // add a listener here
  }

  public void login(String username, String password)
  {
    model.login(username,password);
  }
}
