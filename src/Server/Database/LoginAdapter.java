package Server.Database;

import SharedResources.Request;

import java.sql.SQLException;

public interface LoginAdapter
{
  void login(String username, String password) throws SQLException;
}
