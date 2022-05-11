package Client.Model;

public class ModelImpl implements Model {
    private String lastUpdate;

    @Override
    public String getLastUpdateBalance() {
        return lastUpdate = "ur broke af";
    }

    public void calculateBalance() {
        // here we should bind data from database, calculate the total amount of funds
        //according to the transaction history, and match it with lastUpdate var

    }
}