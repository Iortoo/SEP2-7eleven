package Client.View.Employee.Request;

import Client.Model.Model;

public class RequestViewModel
{
  private Model model;

  public RequestViewModel(Model model)
  {
    this.model=model;
  }

  public void acceptRequest(String requestId)
  {
    model.acceptRequest(requestId);
  }

  public void denyRequest(String requestId)
  {
    model.denyRequest(requestId);
  }
}
