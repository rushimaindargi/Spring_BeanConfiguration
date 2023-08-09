package org.spring.annotation;

public class GearBox {

    String type;
    int numOfGear;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumOfGear() {
        return numOfGear;
    }

    public void setNumOfGear(int numOfGear) {
        this.numOfGear = numOfGear;
    }

    @Override
    public String toString() {
        return "GearBox{" +
                "\ntype='" + type + '\'' +
                ", \n\tnumOfGear=" + numOfGear +
                '}';
    }
}
