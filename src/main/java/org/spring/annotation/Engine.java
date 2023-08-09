package org.spring.annotation;

public class Engine {
    int horsePower;
    int rpm;
    float displacement;
     String cylinderConfig;
     String fuel;

     public Engine(){}
    public Engine(int horsePower, int rpm, float displacement, String cylinderConfig, String fuel) {
        this.horsePower = horsePower;
        this.rpm = rpm;
        this.displacement = displacement;
        this.cylinderConfig = cylinderConfig;
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public float getDisplacement() {
        return displacement;
    }

    public void setDisplacement(float displacement) {
        this.displacement = displacement;
    }

    public String getCylinderConfig() {
        return cylinderConfig;
    }

    public void setCylinderConfig(String cylinderConfig) {
        this.cylinderConfig = cylinderConfig;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }


    @Override
    public String toString() {
        return "Engine{" +
                "\n\thorsePower='" + horsePower + '\'' +
                ", \n\tRMP='" + rpm + '\'' +
                ", \n\tdisplacement='" + displacement + '\'' +
                ", \n\tcylinderConfig='" + cylinderConfig + '\'' +
                ", \n\tfuel='" + fuel + '\'' +
                '}';
    }
}
