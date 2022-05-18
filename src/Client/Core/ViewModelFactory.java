package Client.Core;

import Client.View.Employee.EmployeeOverview.EmployeeOverviewViewModel;
import Client.View.Employee.Request.RequestViewModel;
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

import java.rmi.RemoteException;

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
  private EmployeeOverviewViewModel employeeOverviewViewModel;
  private RequestViewModel requestViewModel;

  public ViewModelFactory(ModelFactory modelFactory)
  {
    this.modelFactory=modelFactory;
  }

  public LoginViewModel getLoginViewModel()throws RemoteException
  {
    if(loginViewModel==null) loginViewModel=new LoginViewModel(modelFactory.getModel());
    return loginViewModel;
  }

  public OverviewViewModel getOverviewViewModel() throws RemoteException
  {
    if(overviewViewModel==null) overviewViewModel = new OverviewViewModel(modelFactory.getModel());
    return overviewViewModel;
  }

  public DepositViewModel getDepositViewModel() throws RemoteException
  {
    if(depositViewModel==null) depositViewModel = new DepositViewModel(modelFactory.getModel());
    return depositViewModel;
  }

  public WithdrawalViewModel getWithdrawalViewModel() throws RemoteException
  {
    if(withdrawalViewModel==null) withdrawalViewModel = new WithdrawalViewModel(modelFactory.getModel());
    return withdrawalViewModel;
  }

  public ProfileViewModel getProfileViewModel() throws RemoteException
  {
    if(profileViewModel==null) profileViewModel = new ProfileViewModel(modelFactory.getModel());
    return profileViewModel;
  }

  public ProfileInfoViewModel getProfileInfoViewModel() throws RemoteException
  {
    if(profileInfoViewModel==null)profileInfoViewModel=new ProfileInfoViewModel(modelFactory.getModel());
    return profileInfoViewModel;
  }

  public AccountListViewModel getAccountListViewModel() throws RemoteException
  {
    if(accountListViewModel==null)accountListViewModel = new AccountListViewModel(modelFactory.getModel());
    return accountListViewModel;
  }

  public NewAccountViewModel getNewAccountViewModel() throws RemoteException
  {
    if(newAccountViewModel==null)newAccountViewModel = new NewAccountViewModel(modelFactory.getModel());
    return newAccountViewModel;
  }

  public RegisterViewModel getRegisterViewModel() throws RemoteException
  {
    if(registerViewModel==null)registerViewModel = new RegisterViewModel(modelFactory.getModel());
    return registerViewModel;
  }

  public LoanOverviewViewModel getLoanOverviewViewModel() throws RemoteException
  {
    if(loanOverviewViewModel==null) loanOverviewViewModel = new LoanOverviewViewModel(modelFactory.getModel());
    return loanOverviewViewModel;
  }

  public LoansViewModel getLoansViewModel() throws RemoteException
  {
    if(loansViewModel==null) loansViewModel = new LoansViewModel(modelFactory.getModel());
    return loansViewModel;
  }

  public MakeTransferViewModel getMakeTransferViewModel() throws RemoteException
  {
    if(makeTransferViewModel==null) makeTransferViewModel = new MakeTransferViewModel(modelFactory.getModel());
    return makeTransferViewModel;
  }

  public NewLoanViewModel getNewLoanViewModel() throws RemoteException
  {
    if(newLoanViewModel==null)newLoanViewModel = new NewLoanViewModel(modelFactory.getModel());
    return newLoanViewModel;
  }

  public TransfersViewModel getTransfersViewModel() throws RemoteException
  {
    if(transfersViewModel==null)transfersViewModel = new TransfersViewModel(modelFactory.getModel());
    return transfersViewModel;
  }

  public EmployeeOverviewViewModel getEmployeeOverviewViewModel()
      throws RemoteException
  {
    if(employeeOverviewViewModel==null)employeeOverviewViewModel = new EmployeeOverviewViewModel(modelFactory.getModel());
    return employeeOverviewViewModel;
  }

  public RequestViewModel getRequestViewModel() throws RemoteException
  {
    if(registerViewModel==null)registerViewModel = new RegisterViewModel(modelFactory.getModel());
    return requestViewModel;
  }
}
