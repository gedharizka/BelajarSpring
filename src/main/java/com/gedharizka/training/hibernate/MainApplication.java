package com.gedharizka.training.hibernate;

import com.gedharizka.training.hibernate.configuration.SessionFactoryUtil;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApplication {
    private static final Logger log = LoggerFactory.getLogger(MainApplication.class);

    public static void main(String[] args) {
        System.out.println("Lagi belajar Hibernate nih");

        SessionFactoryUtil util = new SessionFactoryUtil();
        SessionFactory sessionFactory = util.getSessionFactory();

        sessionFactory.close();
        log.info("Hibernate Connection Close ...!!!");
    }
}
