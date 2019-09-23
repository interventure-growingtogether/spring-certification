package org.interventure.quiz03.sla14;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2019-09-20
 */
public class DSBean {

  @Value("${db.driverClassName}")
  private String driverClassName;
  @Value("${db.url}")
  private String url;
  @Value("${db.username}")
  private String username;
  @Value("${db.password}")
  private String password;

  public String getDriverClassName() {
    return driverClassName;
  }

  public String getUrl() {
    return url;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }
}
