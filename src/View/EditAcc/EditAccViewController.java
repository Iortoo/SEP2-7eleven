package View.EditAcc;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import ViewModel.EditAccViewModel;
import javafx.event.ActionEvent;

import java.io.IOException;

public class EditAccViewController {
    private ViewHandler viewHandler;
    private EditAccViewModel editAccViewModel;

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
        this.editAccViewModel = viewModelFactory.getEditAccViewModel();
    }
}
