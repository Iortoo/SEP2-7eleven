package Client.Core;

import ViewModel.BalanceViewModel;

public class ViewModelFactory
{
    private BalanceViewModel balanceViewModel;

    public ViewModelFactory(ModelFactory modelFactory){
        balanceViewModel = new BalanceViewModel(modelFactory.getModel());
    }

    public BalanceViewModel getBalanceViewModel(){return balanceViewModel;}
}
