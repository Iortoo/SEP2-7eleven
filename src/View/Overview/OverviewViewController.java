package View.Overview;

import ViewModel.BalanceViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class OverviewViewController
{
    @FXML Label balanceLabel;

    private BalanceViewModel overviewViewController;

    public OverviewViewController (){
    }

    public void init(BalanceViewModel overviewViewController){
        this.overviewViewController = overviewViewController;

        balanceLabel.textProperty().bind(overviewViewController.updateBalanceProperty());
    }
}
