package Client.View.Deposit;

import Client.Model.Model;

public class DepositViewModel
{
  private Model model;

  public DepositViewModel(Model model)
  {
    this.model=model;
  }

  public Model getModel()
  {
    return model;
  }

  public void deposit(String username,String amount,String cardNo,String cvv,String expDate)
  {
    model.deposit(username,amount,cardNo,cvv,expDate);
  }
}
