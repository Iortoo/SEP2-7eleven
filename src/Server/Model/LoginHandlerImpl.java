package Server.Model;

import Server.Database.login.LoginDAO;
import Server.Database.login.LoginDAOImpl;
import SharedResources.Utils.Request;

import java.sql.SQLException;

public class LoginHandlerImpl implements LoginHandler
{
  private LoginDAO loginDAO;

  public LoginHandlerImpl() throws SQLException
  {
    loginDAO = new LoginDAOImpl();
  }

  @Override public Request login(String userId, String password)
  {
      return loginDAO.login(userId, password);
  }
}
