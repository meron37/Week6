//package com.pluralsight.Vehicles;
//
//public class Main {
//    public static void main(String[] args) {
//
//        // an instance of Moped (child of Vehicle)
//        Moped slowRide = new Moped();
//        slowRide.setColor("Red"); // Inherited from Vehicle
//        slowRide.setFuelCapacity(5);// Inherited from Vehicle
//        slowRide.setWheels(2);
//        slowRide.setPassenger(1);
//        System.out.println("Moped:" + slowRide);
//
//        // == Car object
//        Car sedan = new Car();
//        sedan.setColor("Blue");
//        sedan.setFuelCapacity(50);
//        sedan.setNumberOfDoors(4);
//        sedan.setAirConditioning(true);
//        System.out.println("Car: " + sedan);
//
//        // SemiTruck object
//        SemiTruck bigRig = new SemiTruck();
//        bigRig.setColor("White");
//        bigRig.setFuelCapacity(150);
//        bigRig.setHeavyCargo(true);
//        System.out.println("Semi-Truck: " + bigRig);
//
//        // Hovercraft object
//        Hovercraft hover = new Hovercraft();
//        hover.setColor("Silver");
//        hover.setFuelCapacity(80);
//        hover.setHoverHeight(2.5);
//        hover.setTravelOnWater(true);
//        System.out.println("Hovercraft: " + hover);
//    }
//}


// ========== Add a constructor ======//
package com.pluralsight.Vehicles;

public class Main {
    public static void main(String[] args) {

        // === Moped ===
        Moped slowRide = new Moped("Red", 1, 0, 5, 2, 1);
        System.out.println("Moped: " + slowRide);

        // === Car ===
        Car sedan = new Car("Blue", 4, 500, 50, true, 4);
        System.out.println("Car: " + sedan);

        // === SemiTruck ===
        SemiTruck bigRig = new SemiTruck("White", 2, 10000, 150, true);
        System.out.println("Semi-Truck: " + bigRig);

        // === Hovercraft ===
        Hovercraft hover = new Hovercraft("Silver", 6, 200, 80, true, 2.5);
        System.out.println("Hovercraft: " + hover);
    }
}
