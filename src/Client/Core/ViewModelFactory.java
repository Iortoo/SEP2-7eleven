package Client.Core;

import Client.View.LoanOverview.LoanOverviewViewModel;
import Client.View.Loans.LoansViewModel;
import Client.View.MakeTransfer.MakeTransferViewModel;
import Client.View.NewLoan.NewLoanViewModel;
import Client.View.ProfileInfo.ProfileInfoViewModel;
import Client.View.AccountList.AccountListViewModel;
import Client.View.Deposit.DepositViewModel;
import Client.View.Login.LoginViewModel;
import Client.View.NewAccount.NewAccountViewModel;
import Client.View.Overview.OverviewViewModel;
import Client.View.Profile.ProfileViewModel;
import Client.View.Register.RegisterViewModel;
import Client.View.Transfers.TransfersViewModel;
import Client.View.Withdrawal.WithdrawalViewModel;

public class ViewModelFactory
{
  private ModelFactory modelFactory;
  private LoginViewModel loginViewModel;
  private OverviewViewModel overviewViewModel;
  private DepositViewModel depositViewModel;
  private WithdrawalViewModel withdrawalViewModel;
  private ProfileViewModel profileViewModel;
  private ProfileInfoViewModel profileInfoViewModel;
  private AccountListViewModel accountListViewModel;
  private NewAccountViewModel newAccountViewModel;
  private RegisterViewModel registerViewModel;
  private LoansViewModel loansViewModel;
  private LoanOverviewViewModel loanOverviewViewModel;
  private MakeTransferViewModel makeTransferViewModel;
  private NewLoanViewModel newLoanViewModel;
  private TransfersViewModel transfersViewModel;

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

  public ProfileViewModel getProfileViewModel()
  {
    if(profileViewModel==null) profileViewModel = new ProfileViewModel(modelFactory.getModel());
    return profileViewModel;
  }

  public ProfileInfoViewModel getProfileInfoViewModel()
  {
    if(profileInfoViewModel==null)profileInfoViewModel=new ProfileInfoViewModel(modelFactory.getModel());
    return profileInfoViewModel;
  }

  public AccountListViewModel getAccountListViewModel()
  {
    if(accountListViewModel==null)accountListViewModel = new AccountListViewModel(modelFactory.getModel());
    return accountListViewModel;
  }

  public NewAccountViewModel getNewAccountViewModel()
  {
    if(newAccountViewModel==null)newAccountViewModel = new NewAccountViewModel(modelFactory.getModel());
    return newAccountViewModel;
  }

  public RegisterViewModel getRegisterViewModel()
  {
    if(registerViewModel==null)registerViewModel = new RegisterViewModel(modelFactory.getModel());
    return registerViewModel;
  }

  public LoanOverviewViewModel getLoanOverviewViewModel()
  {
    if(loanOverviewViewModel==null) loanOverviewViewModel = new LoanOverviewViewModel(modelFactory.getModel());
    return loanOverviewViewModel;
  }

  public LoansViewModel getLoansViewModel()
  {
    if(loansViewModel==null) loansViewModel = new LoansViewModel(modelFactory.getModel());
    return loansViewModel;
  }

  public MakeTransferViewModel getMakeTransferViewModel()
  {
    if(makeTransferViewModel==null) makeTransferViewModel = new MakeTransferViewModel(modelFactory.getModel());
    return makeTransferViewModel;
  }

  public NewLoanViewModel getNewLoanViewModel()
  {
    if(newLoanViewModel==null)newLoanViewModel = new NewLoanViewModel(modelFactory.getModel());
    return newLoanViewModel;
  }

  public TransfersViewModel getTransfersViewModel()
  {
    if(transfersViewModel==null)transfersViewModel = new TransfersViewModel(modelFactory.getModel());
    return transfersViewModel;
  }
}
