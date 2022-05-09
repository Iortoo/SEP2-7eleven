package View.Overview;

import Client.Core.ModelFactory;
import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.Model.ModelImpl;
import javafx.application.Application;
import javafx.stage.Stage;

public class Test extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ModelFactory mf = new ModelFactory();
        ViewModelFactory viewModelFactory = new ViewModelFactory(mf);
        ViewHandler viewHandler = new ViewHandler(stage, viewModelFactory);
        viewHandler.start();

        run((ModelImpl) mf.getModel());
    }

    private void run(ModelImpl model){
        Thread thread = new Thread(() -> {
            while (true){
                model.calculateBalance();
            }
        });
        thread.setDaemon(true);
        thread.start();
    }
}
