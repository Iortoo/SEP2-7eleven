package Client.View.Profile;

import Client.Model.Model;

public class ProfileViewModel
{
  private Model model;

  public ProfileViewModel(Model model)
  {
    this.model=model;
  }

  public String getFullName(String username)
  {
    return model.getFullName(username);
  }

  public void logOut()
  {
    model.customerLogOut();
  }
}
