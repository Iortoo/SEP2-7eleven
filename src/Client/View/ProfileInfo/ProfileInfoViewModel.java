package Client.View.ProfileInfo;

import Client.Model.Model;

public class ProfileInfoViewModel
{
  private Model model;

  public ProfileInfoViewModel(Model model)
  {
    this.model=model;
  }

  public Model getModel()
  {
    return model;
  }

  public void requestInfoChange(String fmName,String lName,String username,String adress,String dobD,String dobM,String dobY,String phone)
  {
    model.requestInfoChange(fmName,lName,username,adress,dobD,dobM,dobY,phone);
  }

  public String[] getInfo(String username)
  {
    return model.getInfo(username);
  }
}
