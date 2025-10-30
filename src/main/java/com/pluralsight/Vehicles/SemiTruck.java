//package com.pluralsight.Vehicles;
//
//public class SemiTruck extends Vehicle{
//    boolean heavyCargo;
//
//    public boolean isHeavyCargo() {
//        return heavyCargo;
//    }
//
//
//    public void setHeavyCargo(boolean heavyCargo) {
//        this.heavyCargo = heavyCargo;
//    }
//}


// ============= Adding constructor ============

package com.pluralsight.Vehicles;

public class SemiTruck extends Vehicle{
    boolean heavyCargo;

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity,boolean heavyCargo){
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.heavyCargo = heavyCargo;
    }
    public boolean isHeavyCargo() {
        return heavyCargo;
    }


    public void setHeavyCargo(boolean heavyCargo) {
        this.heavyCargo = heavyCargo;
    }
}
