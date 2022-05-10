package Client.Core;

import View.Overview.OverviewViewController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewHandler {
    private final Stage stage;
    private final ViewModelFactory viewModelFactory;

    public ViewHandler(Stage stage, ViewModelFactory viewModelFactory) {
        this.stage = stage;
        this.viewModelFactory = viewModelFactory;
    }

    public void start() throws Exception {
        openView();
    }

    public void openView() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../View/Overview/OverviewView.fxml"));
        Parent root = fxmlLoader.load();
        OverviewViewController view = fxmlLoader.getController();
        view.init(viewModelFactory.getBalanceViewModel());
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
