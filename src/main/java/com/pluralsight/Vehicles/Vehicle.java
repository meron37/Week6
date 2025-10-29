package com.pluralsight.Vehicles;

public class Vehicle {
    // Common attributes shared by all vehicles
    String color;
    int numberOfPassengers;
    int cargoCapacity;
    int fuelCapacity;

    // == Getters and setters ==
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    // toString() method — displays all vehicle details as text
    @Override
    public String toString() {
        return "Color: " + color +
                ", Passengers: " + numberOfPassengers +
                ", Cargo Capacity: " + cargoCapacity +
                ", Fuel Capacity: " + fuelCapacity;
    }
}