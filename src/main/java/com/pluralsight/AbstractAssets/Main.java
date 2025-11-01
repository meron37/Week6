package com.pluralsight.AbstractAssets;

public class Main {
    public static void main(String[] args) {
        Cash emergencyFund = new Cash("Emergency Cash", "2023-01-01", 1500.00);

        System.out.println("Description: " + emergencyFund.getDescription());
        System.out.println("Value: $" + emergencyFund.getValue());
    }
}
