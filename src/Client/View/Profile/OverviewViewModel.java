package Client.View.Profile;

import Client.Model.Model;
import Client.Model.ModelImpl;

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
