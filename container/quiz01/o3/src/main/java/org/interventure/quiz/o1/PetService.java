package org.interventure.quiz.o1;

import java.util.Map;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2019-09-08
 */
@Component
public class PetService {

  private Cat cat;

  public PetService(Cat cat) {
    this.cat = cat;
  }

}
