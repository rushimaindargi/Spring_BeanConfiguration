package org.spring.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainNew {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(CarBeanConfig.class);

        Car myNewCar = (Car) appContext.getBean("carBean");

        System.out.println("Car bean: "+myNewCar);
        }
    }
