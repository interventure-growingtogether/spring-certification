package org.interventure.quiz03.cg13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2019-09-20
 */
public class QuizBeanApplication {

  public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(QuizConfiguration.class);
    ctx.getBean(QuizBean.class);
  }

}
