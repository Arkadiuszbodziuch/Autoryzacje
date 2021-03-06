package pl.coderslab.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
                csrf().disable()
                .authorizeRequests()
                .antMatchers("/resources/**").permitAll()
                //.antMatchers("/**").permitAll()
                .antMatchers("/buldingPage").permitAll()
                .antMatchers("/myregistration").permitAll()
                .antMatchers("/mylogin?success").permitAll()
                .antMatchers("/mylogin").permitAll()
                .antMatchers("/zlec/search").permitAll()
                .antMatchers("/app").permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/mylogin").permitAll()
                .passwordParameter("password")
                .usernameParameter("email")
                .and()
                .httpBasic()
                .and()
                .logout();

    }


    @Bean(name = "dataSource")
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://remotemysql.com/Qra6NR535w?reconnect=true");
        driverManagerDataSource.setUsername("Qra6NR535w");
        driverManagerDataSource.setPassword("ODGauCWPA0");
        return driverManagerDataSource;
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }

    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {

        auth
                .jdbcAuthentication()
                .dataSource(dataSource())
                .usersByUsernameQuery(
                        "select email, password, active from users where email=?")
                .authoritiesByUsernameQuery(
                        "select u.email, r.role from users u inner join user_role ur on(u.id=ur.user_id) inner join roles r on(ur.role_id=r.id) where u.email=?")
                .passwordEncoder(passwordEncoder());
    }


}