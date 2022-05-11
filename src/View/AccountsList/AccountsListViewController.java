package View.AccountsList;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import ViewModel.AccountsListViewModel;
import javafx.event.ActionEvent;

import java.io.IOException;

public class AccountsListViewController {

    private AccountsListViewModel accountsListViewModel;
    private ViewHandler viewHandler;

    public void onOverviewButton(ActionEvent actionEvent) throws IOException {
        viewHandler.openOverviewView();
    }

    public void onTransfersButton(ActionEvent actionEvent) throws IOException {
        viewHandler.openTransfersView();
    }

    public void onProfileButton(ActionEvent actionEvent) throws IOException {
        viewHandler.openProfileView();
    }

    public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory){
        this.viewHandler = viewHandler;
        this.accountsListViewModel = viewModelFactory.getAccountsListViewModel();
    }
}
