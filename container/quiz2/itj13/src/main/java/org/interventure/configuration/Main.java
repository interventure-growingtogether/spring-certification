package org.interventure.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2019-11-18
 */
public class Main {

  public static void main(String[] args) {
    ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
    ClientService cs = ac.getBean("clientService1", ClientService.class);
    ClientService cs2 = ac.getBean("clientService2", ClientService.class);
  }
}
