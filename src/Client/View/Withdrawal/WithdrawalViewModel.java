package Client.View.Withdrawal;

import Client.Model.Model;

public class WithdrawalViewModel
{
  private Model model;
  public WithdrawalViewModel(Model model)
  {
    this.model=model;
  }

  public Model getModel()
  {
    return model;
  }

  public void withdraw(String username,String amount,String cardNo,String cvv,String expDate)
  {
    model.withdraw(username,amount,cardNo,cvv,expDate);
  }
}
