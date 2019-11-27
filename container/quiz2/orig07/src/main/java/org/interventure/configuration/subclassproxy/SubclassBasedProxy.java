package org.interventure.configuration.subclassproxy;

import org.interventure.configuration.AppConfig;
import org.interventure.configuration.ClientDao;
import org.interventure.configuration.ClientService;

/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2019-11-18
 */
public class SubclassBasedProxy extends AppConfig {

  private AppConfig target;
  private ClientDao clientDao;

  public SubclassBasedProxy(AppConfig target) {
    this.target = target;
  }

  @Override
  public ClientService clientService1() {
    return target.clientService1();
  }

  @Override
  public ClientService clientService2() {
    return target.clientService2();
  }

  @Override
  public ClientDao clientDao() {
    if (clientDao == null) {
      clientDao = target.clientDao();
    }
    return clientDao;
  }
}

