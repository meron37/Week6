//package com.pluralsight.Vehicles;
//
//public class Hovercraft extends Vehicle{
//    boolean travelOnWater;
//    double hoverHeight;
//
//    public boolean isTravelOnWater() {
//        return travelOnWater;
//    }
//
//    public void setTravelOnWater(boolean travelOnWater) {
//        this.travelOnWater = travelOnWater;
//    }
//
//    public double getHoverHeight() {
//        return hoverHeight;
//    }
//
//    public void setHoverHeight(double hoverHeight) {
//        this.hoverHeight = hoverHeight;
//    }
//}

// =========== Adding constructor ======

package com.pluralsight.Vehicles;

public class Hovercraft extends Vehicle{
    boolean travelOnWater;
    double hoverHeight;


    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity,boolean travelOnWater, double hoverHeight){
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.travelOnWater = travelOnWater;
        this.hoverHeight = hoverHeight;

    }
    public boolean isTravelOnWater() {
        return travelOnWater;
    }

    public void setTravelOnWater(boolean travelOnWater) {
        this.travelOnWater = travelOnWater;
    }

    public double getHoverHeight() {
        return hoverHeight;
    }

    public void setHoverHeight(double hoverHeight) {
        this.hoverHeight = hoverHeight;
    }
}

