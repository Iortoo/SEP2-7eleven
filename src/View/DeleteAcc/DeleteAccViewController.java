package View.DeleteAcc;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import ViewModel.DeleteAccViewModel;
import javafx.event.ActionEvent;

import java.io.IOException;

public class DeleteAccViewController {
    private ViewHandler viewHandler;
    private DeleteAccViewModel deleteAccViewModel;

    public void onCancelButton(ActionEvent actionEvent) throws IOException {
        viewHandler.openProfileView();
    }

    public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory) {
        this.viewHandler = viewHandler;
        this.deleteAccViewModel = viewModelFactory.getDeleteAccViewModel();
    }
}
