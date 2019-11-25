package org.interventure.configuration.subclassproxy;

import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.CoreMatchers;
import org.interventure.configuration.AppConfig;
import org.interventure.configuration.ClientService;
import org.interventure.configuration.subclassproxy.SubclassBasedProxy.Proxy;
import org.junit.Test;

/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2019-11-25
 */
public class SubclassBasedProxyTest {

  @Test
  public void testSingleton() {

    AppConfig appConfig = Proxy.newProxyInstance();

    ClientService clientService = appConfig.clientService1();
    ClientService clientService2 = appConfig.clientService2();

    assertThat(clientService.getClientDao() == clientService2.getClientDao(), CoreMatchers.is(Boolean.TRUE));
  }

}
