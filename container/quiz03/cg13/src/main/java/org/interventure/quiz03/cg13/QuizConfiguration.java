package org.interventure.quiz03.cg13;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2019-09-20
 */
@Configuration
public class QuizConfiguration {

  @Bean(initMethod = "initMethod")
  public QuizBean quizBean() {
    return new QuizBean();
  }

}
