package View;

import Client.Core.ViewHandler;
import javax.swing.text.ViewFactory;

public interface ViewController {

    public void init(ViewHandler viewHandler, ViewFactory viewFactory);

}
