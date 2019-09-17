import com.cfg.AppConfig;
import com.quiz.QuizBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2019-09-08
 */
public class Question12Main {

  public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    QuizBean bean = ctx.getBean(QuizBean.class);
    System.out.println(bean);
  }

}
