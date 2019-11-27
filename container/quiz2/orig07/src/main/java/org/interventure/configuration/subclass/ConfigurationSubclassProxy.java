package org.interventure.configuration.subclass;

import org.interventure.configuration.AppConfig;
import org.interventure.configuration.ClientDao;

public class ConfigurationSubclassProxy extends AppConfig {

  private ClientDao dao;

  @Override
  public ClientDao clientDao() {
    if (dao == null) {
      dao = super.clientDao();
    }
    return dao;
  }

}
