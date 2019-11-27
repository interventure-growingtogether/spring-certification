package org.interventure.configuration.subclass;

import org.interventure.configuration.AppConfig;
import org.interventure.configuration.ClientDao;

public class ConfigurationSubclassProxy extends AppConfig {

  private ClientDao target;

  @Override
  public ClientDao clientDao() {
    if (target == null) {
      target = super.clientDao();
    }
    return target;
  }


  public static class ProxyCreator {

    public static AppConfig newProxyInstance() {
      return new ConfigurationSubclassProxy();
    }

  }
}
