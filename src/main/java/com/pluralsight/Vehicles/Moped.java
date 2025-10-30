//package com.pluralsight.Vehicles;
//
//
//public class Moped extends Vehicle{
//    int wheels;
//    int passenger;
//
//    public int getWheels() {
//        return wheels;
//    }
//
//    public void setWheels(int wheels) {
//        this.wheels = wheels;
//    }
//
//    public int getPassenger() {
//        return passenger;
//    }
//
//    public void setPassenger(int passenger) {
//        this.passenger = passenger;
//    }
//
//
//
//}


// ========= Adding a constructor =====

package com.pluralsight.Vehicles;


public class Moped extends Vehicle{
    int wheels;
    int passenger;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity,int wheels, int passenger){
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.wheels = wheels;
        this.passenger = passenger;
    }
    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }



}