package View.Profile;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class OverviewViewController
{
    @FXML Label balanceLabel;

    private OverviewViewController overviewViewController;

    public OverviewViewController (){
    }

    public void init(OverviewViewController overviewViewController){
        this.overviewViewController = overviewViewController;

        balanceLabel.textProperty().bind(overviewViewController.updateBalanceProperty);
    }
}
