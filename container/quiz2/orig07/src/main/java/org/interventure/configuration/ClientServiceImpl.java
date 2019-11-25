package org.interventure.configuration;

/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2019-11-18
 */
public class ClientServiceImpl implements ClientService {

  private ClientDao clientDao;

  public void setClientDao(ClientDao clientDao) {

    this.clientDao = clientDao;
  }

  @Override
  public ClientDao getClientDao() {
    return clientDao;
  }
}
