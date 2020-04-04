package com.springboot.chapter3.config;

import com.springboot.chapter3.pojo.User;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IoCTest {

    private static Logger log = Logger.getLogger(IoCTest.class);
    public static void main(String[] args){
        System.out.println("this is a IoCTest");
        ApplicationContext ctx = new AnnotationConfigApplicationContext((AppConfig.class));//装配Bean
        System.out.println("this is a IoCTest2");
        User user = ctx.getBean(User.class);
        System.out.println("this is a IoCTest3");
        log.info(user.getId());
        System.out.println(user.getId());
        System.out.println(user.getClass());
    }
}
