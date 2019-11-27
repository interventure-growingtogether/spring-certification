package org.interventure.configuration.dynamicproxy;

import static org.hamcrest.MatcherAssert.assertThat;

import java.lang.reflect.Proxy;
import org.hamcrest.CoreMatchers;
import org.interventure.configuration.AppConfig;
import org.interventure.configuration.ClientService;
import org.interventure.configuration.Config;
import org.junit.Test;

/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2019-11-25
 */
public class DynamicProxyAppConfigTest {

  @Test
  public void testSingleton() {
    Config appConfig = (Config) Proxy.newProxyInstance(DynamicProxyAppConfigTest.class.getClassLoader(), new Class[]{Config.class}, new AppConfigDynamicProxy(new AppConfig()));

    ClientService cs = appConfig.clientService1();
    ClientService cs2 = appConfig.clientService2();

    assertThat(cs.getClientDao() == cs2.getClientDao(), CoreMatchers.is(Boolean.FALSE));
  }
}
