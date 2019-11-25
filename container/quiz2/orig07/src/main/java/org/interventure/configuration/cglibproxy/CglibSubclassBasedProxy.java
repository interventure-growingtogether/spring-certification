package org.interventure.configuration.cglibproxy;

import org.interventure.configuration.AppConfig;
import org.interventure.configuration.dynamicproxy.DynamicProxyAppConfig;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;

/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2019-11-18
 */
public class CglibSubclassBasedProxy {

  public static AppConfig newProxyInstance(AppConfig proxy) {
    DynamicProxyAppConfig dp = new DynamicProxyAppConfig(proxy);
    Enhancer e = new Enhancer();
    e.setSuperclass(AppConfig.class);
    e.setCallback((InvocationHandler) (o, method, objects) -> dp.invoke(proxy, method, objects));
    return (AppConfig) e.create();
  }

}
