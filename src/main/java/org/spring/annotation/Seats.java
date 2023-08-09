package org.spring.annotation;

public class Seats {
    String type;
    boolean heated;
    String colour;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHeated() {
        return heated;
    }

    public void setHeated(boolean heated) {
        this.heated = heated;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "\nSeats{" +
                "\n\ttype='" + type + '\'' +
                ", \n\theated=" + heated +
                ", \n\tcolour='" + colour + '\'' +
                '}';
    }
}
