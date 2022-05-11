package View.Profile;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import ViewModel.ProfileViewModel;
import javafx.event.ActionEvent;

import java.io.IOException;

public class ProfileViewController {
    private ViewHandler viewHandler;
    private ProfileViewModel profileViewModel;

    public void onOverviewButton(ActionEvent actionEvent) throws IOException {
        viewHandler.openOverviewView();
    }

    public void onTransfersButton(ActionEvent actionEvent) throws IOException {
        viewHandler.openTransfersView();
    }

    public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory) {
        this.viewHandler = viewHandler;
        this.profileViewModel = viewModelFactory.getProfileViewModel();
    }
}
