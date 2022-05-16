package Client.View.Employee.EmployeeOverview;

import Client.Model.Model;

import java.util.ArrayList;

public class EmployeeOverviewViewModel
{
  private Model model;

  public EmployeeOverviewViewModel(Model model)
  {
    this.model=model;
  }

  public ArrayList<String> getRequests()
  {
    return model.getRequests();
  }

  public void logOut()
  {
    model.employeeLogOut();
  }
}
