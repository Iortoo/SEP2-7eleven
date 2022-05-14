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

  public void withdraw(String amount,String cardNo,String cvv,String expDate)
  {
    model.withdraw(amount,cardNo,cvv,expDate);
  }
}
