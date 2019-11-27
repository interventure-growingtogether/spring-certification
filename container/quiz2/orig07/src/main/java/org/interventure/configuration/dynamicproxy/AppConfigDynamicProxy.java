package org.interventure.configuration.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import org.interventure.configuration.AppConfig;
import org.interventure.configuration.ClientDao;

public class AppConfigDynamicProxy implements InvocationHandler {

  private AppConfig target;
  private ClientDao clientDao;

  public AppConfigDynamicProxy(AppConfig target) {
    this.target = target;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    if (method.getName().equalsIgnoreCase("clientDao")) {
      if (clientDao == null) {
        clientDao = target.clientDao();
      } else {
        return clientDao;
      }
    }
    return method.invoke(target, args);
  }


}
