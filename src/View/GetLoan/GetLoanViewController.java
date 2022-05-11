package View.GetLoan;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import ViewModel.GetLoanViewModel;
import javafx.event.ActionEvent;

import java.io.IOException;

public class GetLoanViewController {
    private ViewHandler viewHandler;
    private GetLoanViewModel getLoanViewModel;

    public void onOverviewButton(ActionEvent actionEvent) throws IOException {
        viewHandler.openOverviewView();
    }

    public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory) {
        this.viewHandler = viewHandler;
        this.getLoanViewModel = viewModelFactory.getGetLoanViewModel();
    }
}
