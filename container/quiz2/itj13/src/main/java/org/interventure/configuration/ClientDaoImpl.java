package org.interventure.configuration;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2019-11-18
 */
@Component
@Scope(value = "prototype")
public class ClientDaoImpl implements ClientDao {

}
