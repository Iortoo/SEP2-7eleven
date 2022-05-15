package Client.View.MakeTransfer;

import Client.Model.Model;

public class MakeTransferViewModel
{
  private Model model;

  public MakeTransferViewModel(Model model)
  {
    this.model=model;
  }

  public int transfer(String username,String accountNo,String recAccNo,String recSwift,String amount)
  {
    return model.transfer(username,accountNo,recAccNo,recSwift,amount);
  }
}
