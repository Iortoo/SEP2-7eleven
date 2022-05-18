package Server.Model;

import SharedResources.Utils.Request;

public interface LoginHandler
{
  Request login(String userId, String password);
}
