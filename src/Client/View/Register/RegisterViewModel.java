package Client.View.Register;

import Client.Model.Model;

public class RegisterViewModel
{
  private Model model;

  public RegisterViewModel(Model model)
  {
    this.model=model;
  }

  public void signup(String id, String type, String fName, String lName,String address, String dob, String phone)
  {
    model.signup(id,type,fName,lName,address,dob,phone);
  }
}
