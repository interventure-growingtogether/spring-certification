package org.interventure.quiz.o1;

import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2019-09-08
 */
@Component
public class Dog implements Pet {

  @Override
  public String toString() {
    return "Dog";
  }

}
