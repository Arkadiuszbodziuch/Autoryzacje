package pl.coderslab.app;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.stereotype.Component;

@Component
public class DataSource extends BasicDataSource {
    public DataSource() {
        setDriverClassName("com.mysql.cj.jdbc.Driver");
        setUrl("jdbc:mysql://remotemysql.com:3306/Qra6NR535w");
        setUsername("Qra6NR535w");
        setPassword("ODGauCWPA0");
    }
}
