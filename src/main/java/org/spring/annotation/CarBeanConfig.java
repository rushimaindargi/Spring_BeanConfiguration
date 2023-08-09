package org.spring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Set;

@Configuration
public class CarBeanConfig {

    @Bean
    public Car carBean(){
        Car car = new Car();

        ArrayList<String> notes = new ArrayList<>();
        notes.add("Internal Combustion Engine");
        notes.add("5 year Service included");

        car.setType("Hatchback");
        car.setModel("VW GTI 2021");
        car.setPrice(350000);
        car.setCombinedFuelEconomy(25);
        car.setNotes(notes);


        return car;
    }

    @Bean (name = "VWEngine")
    public Engine engine(){
        return new Engine(228, 5000, 2.0f, "I-6", "Premium");
    }

@Bean(name = "gearBoxVM")
    public GearBox gearBox(){
       GearBox gearBox = new GearBox();
       gearBox.setType("Manual");
       gearBox.setNumOfGear(8);

       return gearBox;
}

@Bean(name = "seatOne")
public Seats seatOne(){
    Seats seatsConfig = new Seats();
    seatsConfig.setType("Leather");
    seatsConfig.setColour("blue");
    seatsConfig.setHeated(true);

    return seatsConfig;
}

    @Bean(name = "seatTwo")
    public Seats seatTwo(){
        Seats seatsConfig = new Seats();
        seatsConfig.setType("Vinyle");
        seatsConfig.setColour("black");
        seatsConfig.setHeated(false);

        return seatsConfig;
    }

    @Bean(name = "seatThree")
    public Seats seatThree(){
        Seats seatsConfig = new Seats();
        seatsConfig.setType("wooden Leather");
        seatsConfig.setColour("brown");
        seatsConfig.setHeated(false);

        return seatsConfig;
    }

    @Bean(name = "seatFour")
    public Seats seatFour(){
        Seats seatsConfig = new Seats();
        seatsConfig.setType("Fabric");
        seatsConfig.setColour("white");
        seatsConfig.setHeated(false);

        return seatsConfig;
    }
}
