package Server.Database;

import SharedResources.Request;

import java.sql.*;

public class LoginAdapterImpl implements LoginAdapter
{
  public LoginAdapterImpl()
  {
    try
    {
      DriverManager.registerDriver(new org.postgresql.Driver());
    } catch (SQLException e)
    {
      e.printStackTrace();
    }
  }


  @Override public void login(String username, String password)
      throws SQLException
  {
    try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentSchema=7eleven", "postgres", "postgres"))
    {
      String sql = "select * from customer\n"
          + "where id = ? and password = ?";
      PreparedStatement preparedStatement = connection.prepareStatement(sql);
      preparedStatement.setString(1, username);
      preparedStatement.setString(2, password);
      ResultSet resultSet = preparedStatement.executeQuery();
      System.out.println("Hereee!!!!");
      while (resultSet.next())
      {
        if (resultSet.getString(1).equals(username))
        {
          System.out.println("Congrats");
          connection.close();
        } else
          System.out.println("sugi");
      }

    }
  }
}
