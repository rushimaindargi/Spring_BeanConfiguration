package org.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext_v1.xml");
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext_v2.xml");
        Car myNewCar = (Car)appContext.getBean("newCarBean");

        System.out.println("New Car bean: "+myNewCar);
        }
    }
