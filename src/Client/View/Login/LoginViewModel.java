package Client.View.Login;

import Client.Core.ViewHandler;
import Client.Model.Model;
import Client.Model.ModelImpl;
import javafx.beans.Observable;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableIntegerValue;
import javafx.collections.FXCollections;

import java.beans.PropertyChangeEvent;
import java.io.IOException;

public class LoginViewModel
{
  private Model model;
  private ViewHandler viewHandler;

  private StringProperty userId;
  private StringProperty password;
 // private StringProperty error;

  public LoginViewModel(Model model)
  {

    this.model = model;

    this.userId=new SimpleStringProperty();
    this.password=new SimpleStringProperty();
   // this.error=new SimpleStringProperty();
  }

  public void login(String username, String password)
  {
    model.login(username,password);
  }

  public Model getModel()
  {
    return model;
  }

  public StringProperty userIdProperty(){
    return userId;
  }
  public StringProperty passwordProperty(){
    return password;
  }
  //public StringProperty errorProperty(){
   // return error;
  //}

  /*public boolean validateLogin(){
    try{
      if(userIdProperty()!=null && passwordProperty()!=null){
      model.validation(userId.get(), password.get());
     error.set("Invalid credentials.");}
      else {
        error.set("You must enter username and password.");
      }
    }
    catch (Exception e){
      error.set(e.getMessage());
      return false;
    }
    return true;
  }*/

  public boolean login(){
    try{
      model.login(userId.get(),password.get());
      reset();
    }
    catch (Exception e){
     // error.set(e.getMessage());
      return false;
    }
    return true;
  }

  public void reset(){
    userId.set(null);
    password.set(null);
   // error.set(null);
  }
}
