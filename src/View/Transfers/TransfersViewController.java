package View.Transfers;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import ViewModel.TransfersViewModel;
import javafx.event.ActionEvent;

import java.io.IOException;

public class TransfersViewController {
    private ViewHandler viewHandler;
    private TransfersViewModel transfersViewModel;

    public void onOverviewButton(ActionEvent actionEvent) throws IOException {
        viewHandler.openOverviewView();
    }

    public void onProfileButton(ActionEvent actionEvent) throws IOException {
        viewHandler.openProfileView();
    }

    public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory) {
        this.viewHandler = viewHandler;
        this.transfersViewModel = viewModelFactory.getTransfersViewModel();
    }
}
