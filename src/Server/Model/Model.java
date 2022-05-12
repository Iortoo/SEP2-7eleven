package Server.Model;

import SharedResources.Subject;

import java.io.Serializable;
import java.sql.SQLException;

public interface Model extends Subject, Serializable
{
  int getLogin(String username, String password) throws SQLException;
  int getSignup(String username, String password);
}