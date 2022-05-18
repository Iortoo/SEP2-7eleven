package SharedResources.Utils;

import java.io.Serializable;

public class User implements Serializable
{
  private String userId;
  private String password;

  public User(String userId, String password)
  {
    this.userId = userId;
    this.password = password;
  }

  public void setPassword(String password)
  {
    this.password = password;
  }

  public void setUserId(String userId)
  {
    this.userId = userId;
  }

  public String getUserId()
  {
    return userId;
  }

  public String getPassword()
  {
    return password;
  }
}
