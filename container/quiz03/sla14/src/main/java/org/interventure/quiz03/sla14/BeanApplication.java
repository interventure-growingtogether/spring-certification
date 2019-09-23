package org.interventure.quiz03.sla14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2019-09-20
 */
public class BeanApplication {

  public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(DSConfig.class);
    DSBean bean = ctx.getBean("bean", DSBean.class);
    System.out.println(bean.getDriverClassName());
  }

}
