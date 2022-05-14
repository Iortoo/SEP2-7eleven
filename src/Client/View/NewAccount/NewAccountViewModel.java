package Client.View.NewAccount;

import Client.Model.Model;

public class NewAccountViewModel
{
  private Model model;

  public NewAccountViewModel(Model model)
  {
    this.model=model;
  }

  public void newAccount(String username,String type, String amount)
  {
    model.newAccount(username,type,amount);
  }
}
