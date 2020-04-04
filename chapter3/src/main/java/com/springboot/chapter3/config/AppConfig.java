package com.springboot.chapter3.config;
import com.springboot.chapter3.pojo.User;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

import javax.sql.DataSource;
import javax.xml.ws.Service;
import java.util.Properties;


@Configuration
@ComponentScan("com.springboot.chapter3.*")
public class AppConfig {
    @Bean(name = "user")
    public User initUser(){
        System.out.println("this is a initUser");
        User user = new User();
        user.setId(1L);
        user.setUserName("user_name_1");
        user.setNote("note_1");
        return user;
    }
    @Bean(name = "database")
    public DataSource getDataSource(){
        Properties props = new Properties();
        props.setProperty("driver","com.mysql.jdbc.Driver");
        props.setProperty("url","jdbc:mysql://localhost:3306/chaper3");
        props.setProperty("username","root");
        props.setProperty("password","123456");
        DataSource dataSource = null;
        try{
            dataSource = BasicDataSourceFactory.createDataSource((props));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }
}
