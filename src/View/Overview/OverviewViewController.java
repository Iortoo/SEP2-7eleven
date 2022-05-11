package View.Overview;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import ViewModel.OverviewViewModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class OverviewViewController {
    @FXML
    Label balanceLabel;
    @FXML
    Button accountsButton;

    public OverviewViewModel overviewViewModel;
    private ViewHandler viewHandler;

    public OverviewViewController() {
    }

    public void onAccountsListButton(ActionEvent actionEvent) throws IOException {
        viewHandler.openAccountsListView();
    }

    public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory){
        this.viewHandler = viewHandler;
        this.overviewViewModel = viewModelFactory.getBalanceViewModel();

        balanceLabel.textProperty().bind(overviewViewModel.updateBalanceProperty());
    }
}
