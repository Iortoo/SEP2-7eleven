package Server;

import java.sql.*;

public class DeleteLater
{
  public static void main(String[] args)
  {
    try
    {
      Connection connection = DriverManager.getConnection(
          "jdbc:postgresql://localhost:5432/postgres?currentSchema=7eleven",
          "postgres", "postgres");

      Statement statement = connection.createStatement();
      ResultSet resultSet = statement.executeQuery("SELECT * FROM customer");

      while (resultSet.next())
      {
        System.out.println(resultSet.getString("id"));
        //System.out.println(resultSet.getString("fname"));
      }
      connection.close();
    } catch (SQLException e)
    {
      e.printStackTrace();
    }
  }
}


