package Client.Networking;

import SharedResources.Subject;

public interface Client extends Subject
{
  void signup(String username, String password);
  void login(String username, String password);
  void logout();
}
