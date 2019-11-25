package org.interventure.configuration;

import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2019-11-25
 */
public class AppConfigTest {

  @Test
  public void testSingleton() {
    ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
    ClientService cs = ac.getBean("clientService1", ClientService.class);
    ClientService cs2 = ac.getBean("clientService2", ClientService.class);

    assertThat(cs.getClientDao() == cs2.getClientDao(), CoreMatchers.is(Boolean.TRUE));
  }

}
