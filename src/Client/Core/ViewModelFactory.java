package Client.Core;

import ViewModel.*;

public class ViewModelFactory {
    private OverviewViewModel overviewViewModel;
    private AccountsListViewModel accountsListViewModel;
    private CreateNewAccViewModel createNewAccViewModel;
    private EditAccViewModel editAccViewModel;
    private GetLoanViewModel getLoanViewModel;
    private InternalTransfersViewModel internalTransfersViewModel;
    private LogoutViewModel logoutViewModel;
    private ProfileViewModel profileViewModel;
    private RegisterViewModel registerViewModel;
    private TransfersViewModel transfersViewModel;

    public ViewModelFactory(ModelFactory modelFactory) {
        overviewViewModel = new OverviewViewModel(modelFactory.getModel());
        accountsListViewModel = new AccountsListViewModel(modelFactory.getModel());
        createNewAccViewModel = new CreateNewAccViewModel(modelFactory.getModel());
        editAccViewModel = new EditAccViewModel(modelFactory.getModel());
        getLoanViewModel = new GetLoanViewModel(modelFactory.getModel());
        internalTransfersViewModel = new InternalTransfersViewModel(modelFactory.getModel());
        logoutViewModel = new LogoutViewModel(modelFactory.getModel());
        profileViewModel = new ProfileViewModel(modelFactory.getModel());
        registerViewModel = new RegisterViewModel(modelFactory.getModel());
        transfersViewModel = new TransfersViewModel(modelFactory.getModel());

    }

    public OverviewViewModel getBalanceViewModel() {
        return overviewViewModel;
    }

    public AccountsListViewModel getAccountsListViewModel() {
        return accountsListViewModel;
    }

    public CreateNewAccViewModel getCreateNewAccViewModel() {
        return createNewAccViewModel;
    }

    public EditAccViewModel getEditAccViewModel() {
        return editAccViewModel;
    }

    public GetLoanViewModel getGetLoanViewModel() {
        return getLoanViewModel;
    }

    public InternalTransfersViewModel getInternalTransfersViewModel() {
        return internalTransfersViewModel;
    }

    public LogoutViewModel getLogoutViewModel() {
        return logoutViewModel;
    }

    public ProfileViewModel getProfileViewModel() {
        return profileViewModel;
    }

    public RegisterViewModel getRegisterViewModel() {
        return registerViewModel;
    }

    public TransfersViewModel getTransfersViewModel() {
        return transfersViewModel;
    }
}
