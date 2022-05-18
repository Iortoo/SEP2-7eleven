package Server.Database.login;

import Server.Database.DatabaseConnection;
import SharedResources.Utils.Request;
import SharedResources.Utils.User;

import java.sql.*;

public class LoginDAOImpl implements LoginDAO
{
  public LoginDAOImpl() throws SQLException
  {
    DriverManager.registerDriver(new org.postgresql.Driver());
  }

  public Request login(String userId, String password)
  {
    try (Connection connection = DatabaseConnection.getConnection())
    {
      //String sql = "select * from customer where user_id = ? and password = ?";
      PreparedStatement preparedStatement = connection.prepareStatement("select * from customer where user_id = ? and password = ?");
      preparedStatement.setString(1, userId);
      preparedStatement.setString(2, password);

      ResultSet resultSet = preparedStatement.executeQuery();

      if (resultSet.next())
      {
        String userid = resultSet.getString("user_id");
        String pass = resultSet.getString("password");
        connection.close();
        System.out.println(userid);
        return new Request("username details",new User(userId,password));
      }
      else return new Request("Username si parola shit",null);

    } catch (SQLException e)
    {
      return new Request(e.getMessage(), null);
    }
  }
}
