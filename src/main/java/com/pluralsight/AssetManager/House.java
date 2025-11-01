package com.pluralsight.AssetManager;

public class House extends Asset {
    private String address;
    private int condition;   // 1=excellent, 2=good, 3=fair, 4=poor
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost,
                 String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = Math.max(0, squareFoot);
        this.lotSize = Math.max(0, lotSize);
    }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public int getCondition() { return condition; }
    public void setCondition(int condition) { this.condition = condition; }

    public int getSquareFoot() { return squareFoot; }
    public void setSquareFoot(int squareFoot) { this.squareFoot = Math.max(0, squareFoot); }

    public int getLotSize() { return lotSize; }
    public void setLotSize(int lotSize) { this.lotSize = Math.max(0, lotSize); }

    @Override
    public double getValue() {
        double pricePerSqFt = pricePerSqFtForCondition(condition);
        double structureValue = pricePerSqFt * squareFoot;
        double lotBonus = 0.25 * lotSize;
        double value = structureValue + lotBonus;
        return Math.max(0.0, value);
    }

    private double pricePerSqFtForCondition(int cond) {
        switch (cond) {
            case 1: return 180.0; // excellent
            case 2: return 130.0; // good
            case 3: return 90.0;  // fair
            case 4: return 80.0;  // poor
            default: return 0.0;
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "description='" + getDescription() + '\'' +
                ", dateAcquired='" + getDateAcquired() + '\'' +
                ", originalCost=" + getOriginalCost() +
                ", address='" + address + '\'' +
                ", condition=" + condition +
                ", squareFoot=" + squareFoot +
                ", lotSize=" + lotSize +
                ", value=" + getValue() +
                '}';
    }
}
