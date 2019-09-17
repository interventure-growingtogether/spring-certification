package com.ps.config;

import static junit.framework.TestCase.assertNotNull;

import javax.sql.DataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {ProdDataConfig.class, TestDataConfig.class})
@ActiveProfiles("dev")
public class DataSourceTest {
    @Autowired
    private DataSource dataSource;
    @Test
    public void assertDataSource() {
        assertNotNull(dataSource);
    }
}
