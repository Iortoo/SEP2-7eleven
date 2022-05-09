package Server.Model;

import SharedResources.Subject;

import java.io.Serializable;

public interface Model extends Subject, Serializable
{
  boolean getLogin(String username, String password);
  boolean getSignup(String username, String password);
}
