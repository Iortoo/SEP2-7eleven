package Client.Core;

import Client.View.Deposit.DepositViewModel;
import Client.View.Login.LoginViewModel;
import Client.View.Profile.OverviewViewModel;
import Client.View.Withdrawal.WithdrawalViewModel;

public class ViewModelFactory
{
  private ModelFactory modelFactory;
  private LoginViewModel loginViewModel;
  private OverviewViewModel overviewViewModel;
  private DepositViewModel depositViewModel;
  private WithdrawalViewModel withdrawalViewModel;

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

  public DepositViewModel getDepositViewModel()
  {
    if(depositViewModel==null) depositViewModel = new DepositViewModel(modelFactory.getModel());
    return depositViewModel;
  }

  public WithdrawalViewModel getWithdrawalViewModel()
  {
    if(withdrawalViewModel==null) withdrawalViewModel = new WithdrawalViewModel(modelFactory.getModel());
    return withdrawalViewModel;
  }
}
