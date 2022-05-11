package Client.Core;

import View.AccountsList.AccountsListViewController;
import View.GetLoan.GetLoanViewController;
import View.Overview.OverviewViewController;
import View.Profile.ProfileViewController;
import View.Transfers.TransfersViewController;
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
        openOverviewView();
    }

    public void openOverviewView() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../View/Overview/OverviewView.fxml"));
        Parent root = fxmlLoader.load();
        OverviewViewController view = fxmlLoader.getController();
        view.init(this, viewModelFactory);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void openAccountsListView() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../View/AccountsList/AccountsListView.fxml"));
        Parent root = fxmlLoader.load();
        AccountsListViewController view = fxmlLoader.getController();
        view.init(this, viewModelFactory);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void openGetLoanView() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../View/GetLoan/GetLoanView.fxml"));
        Parent root = fxmlLoader.load();
        GetLoanViewController view = fxmlLoader.getController();
        view.init(this, viewModelFactory);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void openTransfersView() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../View/Transfers/TransfersView.fxml"));
        Parent root = fxmlLoader.load();
        TransfersViewController view = fxmlLoader.getController();
        view.init(this, viewModelFactory);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void openProfileView() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../View/Profile/ProfileView.fxml"));
        Parent root = fxmlLoader.load();
        ProfileViewController view = fxmlLoader.getController();
        view.init(this, viewModelFactory);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
