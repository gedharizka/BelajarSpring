package com.gedharizka.training.spring.beans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@Slf4j
public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");


        BeanA a = context.getBean(BeanA.class);
        log.info("{}",a);
        
    }

}
