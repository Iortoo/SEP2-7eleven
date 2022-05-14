package Server.Model;

public interface DatabaseAdapter
{
  int loginQuery(String username, String password);
  int signupQuery(String username);
}
