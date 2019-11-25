package org.interventure.configuration.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import org.interventure.configuration.AppConfig;
import org.interventure.configuration.ClientDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DynamicProxyAppConfig implements InvocationHandler {

  private AppConfig proxied;
  private ClientDao clientDao;

  private static Logger LOGGER = LoggerFactory.getLogger(DynamicProxyAppConfig.class);

  public DynamicProxyAppConfig(AppConfig proxied) {
    this.proxied = proxied;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    if (method.getName().equalsIgnoreCase("clientDao")) {
      if (clientDao == null) {
        clientDao = proxied.clientDao();
      } else {
        return clientDao;
      }
    }
    return method.invoke(proxied, args);
  }


}
