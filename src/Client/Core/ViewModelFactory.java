package Client.Core;

import Client.View.Login.LoginViewModel;
import Client.View.Profile.OverviewViewModel;

public class ViewModelFactory
{
  private ModelFactory modelFactory;
  private LoginViewModel loginViewModel;
  private OverviewViewModel overviewViewModel;

  public ViewModelFactory(ModelFactory modelFactory)
  {
    this.modelFactory=modelFactory;
  }

  public LoginViewModel getLoginViewModel()
  {
    if(loginViewModel==null) loginViewModel=new LoginViewModel(modelFactory.getModel());
    return loginViewModel;
  }

  public OverviewViewModel getOverviewViewModel()
  {
    if(overviewViewModel==null) overviewViewModel = new OverviewViewModel(modelFactory.getModel());
    return overviewViewModel;
  }
}
