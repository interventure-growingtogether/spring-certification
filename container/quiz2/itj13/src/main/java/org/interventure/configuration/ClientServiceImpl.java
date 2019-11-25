package org.interventure.configuration;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2019-11-18
 */
@Service
public class ClientServiceImpl implements ClientService {

  private ClientDao clientDao;

  public ClientServiceImpl(ClientDao clientDao) {
    this.clientDao = clientDao;
  }

  @Override
  @Lookup
  public ClientDao getClientDao() {
    return clientDao;
  }
}
