package com.pluralsight.Vehicles;

public class SemiTruck extends Vehicle{
    boolean heavyCargo;

    public boolean isHeavyCargo() {
        return heavyCargo;
    }

    public void setHeavyCargo(boolean heavyCargo) {
        this.heavyCargo = heavyCargo;
    }
}