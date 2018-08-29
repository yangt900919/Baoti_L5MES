package cn.linkpal.model;

import java.util.HashMap;
import java.util.Map;

public class MemoryData {

  private String username;

  private String token;

  public MemoryData(String username,String token)
  {
      this.username=username;
      this.token=token;
  }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
