package Server.Database.login;

import SharedResources.Utils.Request;

import java.sql.SQLException;

public interface LoginDAO
{
  Request login(String userId, String password);
}
