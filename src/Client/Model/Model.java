package Client.Model;

import SharedResources.Subject;

public interface Model extends Subject
{
  void signup(String username, String password);
  void login(String username, String password);
  void logout();
  void validation(String username, String password);
}
