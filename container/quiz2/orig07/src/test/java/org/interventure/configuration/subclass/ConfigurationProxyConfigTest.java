package org.interventure.configuration.subclass;

import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.CoreMatchers;
import org.interventure.configuration.AppConfig;
import org.interventure.configuration.ClientService;
import org.junit.Test;

/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2019-11-25
 */
public class ConfigurationProxyConfigTest {

  @Test
  public void testSingleton() {

    AppConfig ac = ConfigurationProxyConfig.Proxy.newProxyInstance();
    ClientService cs = ac.clientService1();
    ClientService cs2 = ac.clientService2();

    assertThat(cs.getClientDao() == cs2.getClientDao(), CoreMatchers.is(Boolean.TRUE));
  }

}
