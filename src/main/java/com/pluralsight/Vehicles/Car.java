//package com.pluralsight.Vehicles;
//
//public class Car extends Vehicle{
//    boolean airConditioning;
//    int numberOfDoors;
//
//
//    public boolean isAirConditioning() {
//        return airConditioning;
//    }
//
//    public void setAirConditioning(boolean airConditioning) {
//        this.airConditioning = airConditioning;
//    }
//
//    public int getNumberOfDoors() {
//        return numberOfDoors;
//    }
//
//    public void setNumberOfDoors(int numberOfDoors) {
//        this.numberOfDoors = numberOfDoors;
//    }
//
//
//}



// ===== Adding a constructor =====
package com.pluralsight.Vehicles;

public class Car extends Vehicle{
    private boolean airConditioning;
    private int numberOfDoors;

public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean airConditioning, int numberOfDoors){
    super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    this.airConditioning = airConditioning;
    this.numberOfDoors = numberOfDoors;
}
    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }


}