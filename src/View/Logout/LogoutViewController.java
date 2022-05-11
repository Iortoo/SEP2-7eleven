package View.Logout;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import ViewModel.LogoutViewModel;
import javafx.event.ActionEvent;

import java.io.IOException;

public class LogoutViewController {
    private ViewHandler viewHandler;
    private LogoutViewModel logoutViewModel;

    public void onCancelButton(ActionEvent actionEvent) throws IOException {
        viewHandler.openProfileView();
    }

    public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory) {
        this.viewHandler = viewHandler;
        this.logoutViewModel = viewModelFactory.getLogoutViewModel();
    }
}
