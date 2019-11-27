package org.interventure.configuration.subclassproxy;

import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.CoreMatchers;
import org.interventure.configuration.AppConfig;
import org.interventure.configuration.ClientService;
import org.junit.Test;

/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2019-11-25
 */
public class SubclassBasedProxyTest {

  @Test
  public void testSingleton() {

    AppConfig appConfig = new SubclassBasedProxy(new AppConfig());

    ClientService cs1 = appConfig.clientService1();
    ClientService cs2 = appConfig.clientService2();

    assertThat(cs1.getClientDao() == cs2.getClientDao(), CoreMatchers.is(Boolean.FALSE));
  }

}
