package com.another.quiz;

import com.quiz.QuizBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// autowiring the bean
@Component
public class AnotherQuizBean {

  @Autowired
  QuizBean quizBean;
}
