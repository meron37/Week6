package com.pluralsight.AssetManager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Create a list to hold all assets
        ArrayList<Asset> myAssets = new ArrayList<>();

        //  Add Houses
        House mainHome = new House("My main house", "2018-06-01", 250000,
                "123 Elm Street", 2, 1800, 4000); // good condition
        House vacationHome = new House("Vacation home", "2020-08-15", 200000,
                "45 Beach Ave", 1, 2000, 3500); // excellent condition

        // Add Vehicles
        Vehicle car1 = new Vehicle("My car", "2021-03-20", 30000,
                "Toyota Camry", 2021, 105000);
        Vehicle truck = new Vehicle("Tom's truck", "2015-04-10", 45000,
                "Ford F-150", 2016, 120000);

        //  Add all assets to the ArrayList
        myAssets.add(mainHome);
        myAssets.add(vacationHome);
        myAssets.add(car1);
        myAssets.add(truck);

        // Loop through assets and display details
        for (Asset a : myAssets) {
            System.out.println("-------------------------------------------------");
            System.out.println("Description: " + a.getDescription());
            System.out.println("Date Acquired: " + a.getDateAcquired());
            System.out.printf("Original Cost: $%.2f%n", a.getOriginalCost());
            System.out.printf("Current Value: $%.2f%n", a.getValue());

            // --- Detect type of asset and show  info ---
            if (a instanceof House) {
                House h = (House) a;
                System.out.println("Type: House");
                System.out.println("Address: " + h.getAddress());
                System.out.println("Condition: " + h.getCondition());
                System.out.println("Square Feet: " + h.getSquareFoot());
                System.out.println("Lot Size: " + h.getLotSize());

            } else if (a instanceof Vehicle) {
                Vehicle v = (Vehicle) a;
                System.out.println("Type: Vehicle");
                System.out.println("Make/Model: " + v.getMakeModel());
                System.out.println("Year: " + v.getYear());
                System.out.println("Odometer: " + v.getOdometer());
            }

            System.out.println(); // blank line between assets
        }

        System.out.println("-------------------------------------------------");
        System.out.println("Total Assets Listed: " + myAssets.size());
    }
}
