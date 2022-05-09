package Client.Core;

import View.Overview.OverviewViewController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewHandler
{
    private Stage stage;
    private ViewModelFactory viewModelFactory;

    public ViewHandler(Stage stage, ViewModelFactory viewModelFactory){
        this.stage = stage;
        this.viewModelFactory = viewModelFactory;
    }

    public void start() throws Exception{
        openView("Overview");
    }

    public void openView(String viewToOpen) throws IOException {
        Scene scene = null;
        FXMLLoader loader = new FXMLLoader();
        Parent root = null;

        loader.setLocation(getClass().getResource(viewToOpen + "View.fxml"));
        root = loader.load();
        if ("Overview".equals(viewToOpen)){
            OverviewViewController view = loader.getController();
            view.init(viewModelFactory.getBalanceViewModel());
        }
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
