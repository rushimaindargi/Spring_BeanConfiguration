package org.spring;

import org.spring.auto.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car myCar = (Car)appContext.getBean("carBean");

        System.out.println("Car bean: "+myCar);
        }
    }
