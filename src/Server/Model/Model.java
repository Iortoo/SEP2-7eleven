package Server.Model;

import SharedResources.Subject;

import java.io.Serializable;

public interface Model extends Subject, Serializable
{
  int getLogin(String username, String password);
  int getSignup(String username, String password);
}
