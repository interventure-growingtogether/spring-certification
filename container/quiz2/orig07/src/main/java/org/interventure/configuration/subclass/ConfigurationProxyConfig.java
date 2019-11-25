package org.interventure.configuration.subclass;

import org.interventure.configuration.AppConfig;
import org.interventure.configuration.ClientDao;

public class ConfigurationProxyConfig extends AppConfig {

  private ClientDao clientDao;

  @Override
  public ClientDao clientDao() {
    if (clientDao == null) {
      clientDao = super.clientDao();
    }
    return clientDao;
  }


  public static class Proxy {

    public static AppConfig newProxyInstance() {
      return new ConfigurationProxyConfig();
    }

  }
}
