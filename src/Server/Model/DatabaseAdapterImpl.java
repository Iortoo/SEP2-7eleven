package Server.Model;

import java.sql.*;

public class DatabaseAdapterImpl implements  DatabaseAdapter
{
  private static DatabaseAdapterImpl instance;

  private DatabaseAdapterImpl()
  {

  }

  public static DatabaseAdapterImpl getInstance()
  {
    if(instance==null) instance = new DatabaseAdapterImpl();
    return instance;
  }

  public int loginQuery(String username, String password)
  {
    if(username==null || password==null) return 3;
    try{
      Class.forName("org.postgresql.Driver");

      String url = "jdbc:postgresql://localhost:5432/postgres";
      String user = "admin";
      String pw = "postgres";
      Connection connection = DriverManager.getConnection(url,user,pw);

      String sql = "set schema SEP27eleven"
          + "SELECT id, password FROM customer "
          + "where id = ? and password = ?";

      PreparedStatement statement = connection.prepareStatement(sql);
      statement.setString(1,username);
      statement.setString(2,password);
      ResultSet resultSet = statement.executeQuery();
      while(resultSet.next())
      {
        int columns = resultSet.getMetaData().getColumnCount();
        for(int i=0;i<columns;i++)
        {
          String resultUsername = (String)resultSet.getObject(i+1);
          System.out.println(resultUsername);
        }
      }
      resultSet.close();
      statement.close();
      connection.close();
    }
    catch (ClassNotFoundException | SQLException e){
      System.out.println(e.getMessage());
    }

    return 1;
  }

  public int signupQuery(String username)
  {
    if(username.equals("DummyUsername"))return 1;
    return 0;
  }
}
