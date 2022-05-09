package Client.Core;

import Client.Model.Model;
import Client.Model.ModelImpl;

public class ModelFactory
{
    private Model model;

    public Model getModel(){
        if (model == null){
            model = new ModelImpl();
        }
        return model;
    }
}
