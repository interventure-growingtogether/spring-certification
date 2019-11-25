package org.interventure.configuration.interfaceproxy;


import org.interventure.configuration.ClientDao;
import org.interventure.configuration.ClientService;
import org.interventure.configuration.Config;

public class InterfaceBasedProxy implements Config {

    private ClientDao clientDao;
    private Config config;

    public InterfaceBasedProxy(Config config) {
      this.config = config;
    }

    @Override
    public ClientService clientService1() {
      return config.clientService1();
    }

    @Override
    public ClientService clientService2() {
      return config.clientService2();
    }

    @Override
    public ClientDao clientDao() {
      if (clientDao == null) {
        clientDao = config.clientDao();
      } else {
        return clientDao;
      }
      return clientDao;
    }
  }
