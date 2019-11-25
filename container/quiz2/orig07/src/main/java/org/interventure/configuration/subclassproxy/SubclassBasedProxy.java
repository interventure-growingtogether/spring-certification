package org.interventure.configuration.subclassproxy;

import org.interventure.configuration.AppConfig;
import org.interventure.configuration.ClientDao;

/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2019-11-18
 */
public class SubclassBasedProxy {

  public static class ConfigurationProxiedSubclassAppConfig extends AppConfig {
    private AppConfig appConfig;

    public ConfigurationProxiedSubclassAppConfig(AppConfig appConfig) {
      this.appConfig = appConfig;
    }

    private ClientDao clientDao;

    @Override
    public ClientDao clientDao() {
      if (clientDao == null) {
        clientDao = appConfig.clientDao();
      }
      return clientDao;
    }
  }

  public static class Proxy {

    public static AppConfig newProxyInstance() {
      return new ConfigurationProxiedSubclassAppConfig(new AppConfig());
    }

  }

}
