package com.pluralsight.AssetManager;

import java.time.Year;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost,
                   String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() { return makeModel; }
    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel; }

    public int getYear() {
        return year; }
    public void setYear(int year) {
        this.year = year; }

    public int getOdometer() {
        return odometer; }
    public void setOdometer(int odometer) {
        this.odometer = odometer; }

    @Override
    public double getValue() {
        double original = getOriginalCost();

        //  age
        int currentYear = Year.now().getValue();
        int age = currentYear - year;
        if (age < 0) age = 0;

        // flat $1000 if > 10 years
        if (age > 10) {
            double value = 1000.0;
            if (odometer > 100_000 && !isHondaOrToyota(makeModel)) value *= 0.75;
            return value;
        }

        // Step 3: years per tier
        int yearsAt3 = Math.min(age, 3);                  // 0–3 → 3%
        int yearsAt6 = Math.max(Math.min(age - 3, 3), 0); // 4–6 → 6%
        int yearsAt8 = Math.max(Math.min(age - 6, 4), 0); // 7–10 → 8%

        // total reduction
        double totalReduction = (yearsAt3 * 0.03) + (yearsAt6 * 0.06) + (yearsAt8 * 0.08);
        double value = original * (1.0 - totalReduction);
        if (value < 0) value = 0;

        //  mileage adjustment (unless Honda/Toyota)
        if (odometer > 100_000 && !isHondaOrToyota(makeModel)) value *= 0.75;

        return value;
    }

    private boolean isHondaOrToyota(String model) {
        if (model == null) return false;
        String lower = model.toLowerCase();
        return lower.contains("honda") || lower.contains("toyota");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "description='" + getDescription() + '\'' +
                ", dateAcquired='" + getDateAcquired() + '\'' +
                ", originalCost=" + getOriginalCost() +
                ", makeModel='" + makeModel + '\'' +
                ", year=" + year +
                ", odometer=" + odometer +
                ", value=" + getValue() +
                '}';
    }
}
