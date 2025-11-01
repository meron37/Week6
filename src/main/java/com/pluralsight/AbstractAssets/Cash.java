package com.pluralsight.AbstractAssets;

public class Cash extends Asset {

    // Constructor
    public Cash(String description, String dateAcquired, double originalCostt){
        super(description,dateAcquired,originalCostt);
    }

    @Override
    public double getValue(){
        return getOriginalCost();
    }
}
