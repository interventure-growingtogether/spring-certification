package org.interventure.configuration.cglibproxy;

import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.CoreMatchers;
import org.interventure.configuration.AppConfig;
import org.interventure.configuration.ClientService;
import org.junit.Test;

/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2019-11-25
 */
public class CglibSubclassBasedProxyTest {

  @Test
  public void testSingleton() {
    AppConfig appConfig = CglibSubclassBasedProxy.newProxyInstance(new AppConfig());

    ClientService cs = appConfig.clientService1();
    ClientService cs2 = appConfig.clientService2();

    assertThat(cs.getClientDao() == cs2.getClientDao(), CoreMatchers.is(Boolean.FALSE));
  }
}
