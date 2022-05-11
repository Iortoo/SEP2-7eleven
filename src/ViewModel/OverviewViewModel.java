package ViewModel;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import Client.Model.*;

public class OverviewViewModel {

    private StringProperty updateBalance;
    private Model model;

    public StringProperty updateBalanceProperty() {
        return updateBalance;
    }

    public OverviewViewModel(Model model) {
        this.model = model;
        updateBalance = new SimpleStringProperty("Balance: ");
    }

    public void updateBalance() {
        updateBalance.setValue("Balance: " + model.getLastUpdateBalance());
    }
}
