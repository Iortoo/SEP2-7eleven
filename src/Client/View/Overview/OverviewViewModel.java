package Client.View.Overview;

import Client.Model.Model;

public class OverviewViewModel
{
  private Model model;

  public OverviewViewModel(Model model)
 {
   this.model=model;
 }

  public Model getModel()
  {
     return model;
  }

  public String getBalance()
 {
   return model.getBalance();
 }

  public String getAccountNo(){return model.getAccountNo();}
}
