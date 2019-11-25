package org.interventure.configuration;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2019-11-18
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class ClientServiceImplTest {

  @Autowired
  private ApplicationContext ctx;

  @Test
  public void testIsDependencyPrototype() {
    ClientService cs1 = ctx.getBean("clientServiceImpl", ClientService.class);
    ClientService cs2 = ctx.getBean("clientServiceImpl", ClientService.class);
    assertThat(cs1 == cs2, CoreMatchers.is(Boolean.TRUE));
    assertThat(cs1.getClientDao() != cs2.getClientDao(), CoreMatchers.is(Boolean.TRUE));
  }

}
