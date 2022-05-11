package View.CreateNewAcc;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import ViewModel.CreateNewAccViewModel;
import javafx.event.ActionEvent;

import java.io.IOException;

public class CreateNewAccViewController {
    private ViewHandler viewHandler;
    private CreateNewAccViewModel createNewAccViewModel;

    public void onOverviewButton(ActionEvent actionEvent) throws IOException {
        viewHandler.openOverviewView();
    }

    public void onTransfersButton(ActionEvent actionEvent) throws IOException {
        viewHandler.openTransfersView();
    }

    public void onProfileButton(ActionEvent actionEvent) throws IOException {
        viewHandler.openProfileView();
    }

    public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory) {
        this.viewHandler = viewHandler;
        this.createNewAccViewModel = viewModelFactory.getCreateNewAccViewModel();
    }
}
