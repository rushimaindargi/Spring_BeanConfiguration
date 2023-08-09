package org.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.Set;

public class Car {
String type;
String model;
double price;
int combinedFuelEconomy;

GearBox gearBox;
List<String> notes;
Set<Seats> seatOptions;

    //using @Autowired directly on Engine object for bean dependency injection
//    @Autowired
//    @Qualifier("VWEngine") // Java Configuration
    Engine engine;

    public Car() {
        System.out.println("Default constructor in Car is used");
    }

    // using @Autowired for constructor for engine bean dependency injection
//    @Autowired


    public Car(String type, String model, double price, int combinedFuelEconomy, GearBox gearBox, List<String> notes, Set<Seats> seatOptions, Engine engine) {
        this.type = type;
        this.model = model;
        this.price = price;
        this.combinedFuelEconomy = combinedFuelEconomy;
        this.gearBox = gearBox;
        this.notes = notes;
        this.seatOptions = seatOptions;
        this.engine = engine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCombinedFuelEconomy() {
        return combinedFuelEconomy;
    }

    public void setCombinedFuelEconomy(int combinedFuelEconomy) {
        this.combinedFuelEconomy = combinedFuelEconomy;
    }

    public Engine getEngine() {
        return engine;
    }
    //using @Autowired for setter method instead of using directly on Engine object
//    @Autowired
    @Autowired(required = false)   //not necessary to always link the engine to car, required attribute is used to avoid the runtime exception
//    @Qualifier("newEngineBean") //If there are multiple beans of same type in XML, will throw an exception. To avoid it, using @Qualifier and passing the bean Id to invoke correct bean
    @Qualifier("VWEngine") // Java Configuration
    public void setEngine(Engine engine) {
        this.engine = engine;
        System.out.println("Engine Setter is accessed in Car");
    }
    public GearBox getGearBox() {
        return gearBox;
    }

    @Autowired(required = false)
    public void setGearBox(GearBox gearBox) {
        this.gearBox = gearBox;
    }

    public List<String> getNotes() {
        return notes;
    }

    @Autowired(required = false)
    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public Set<Seats> getSeatOptions() {
        return seatOptions;
    }
    @Autowired(required = false)
    public void setSeatOptions(Set<Seats> seatOptions) {
        this.seatOptions = seatOptions;
    }


    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", \nprice=" + price +
                ", \ncombinedFuelEconomy=" + combinedFuelEconomy +
                ", \n\t" + engine +
                ", \n\t" + gearBox +
                ", \n\tnotes=" + notes +
                ", \n\tseatOptions=" + seatOptions +
                '}';
    }
}
