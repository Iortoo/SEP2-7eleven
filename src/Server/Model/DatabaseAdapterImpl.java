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
  public void deposit(String amount,String cardNo,String cvv,String expDate)
  {
    // add to the deposit table
    // modify the account balance accordingly
  }

  public void withdraw(String amount,String cardNo,String cvv,String expDate)
  {
    //add to the withdraw table
    //modify the account balance accordingly
  }

  public String getBalance()
  {
    // return the account balance
    return "0";
  }

  public String getAccountNo()
  {
    //return account number
    return "1111";
  }

  public String getFullName(String username)
  {
    // return full name based on username
    return "John Johnson";
  }

  public void requestInfoChange(String fmName,String lName,String username,String adress,String dobD,String dobM,String dobY,String phone)
  {
    // add a request to the request table to change credentials
  }

  public String[] getInfo(String username)
  {
    // return an arraylist like this:
    String[] rtrn ={"John","Johnson","123456","StreetFullOfBugs","01","02","1993","11223344"};
    return rtrn;
  }
}
