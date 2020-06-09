package org.dsi.vehiclemanagementsystem;

public class HeavyVehicle extends Vehicle{
    private double weight;

    public HeavyVehicle(String modelNumber, Engine engineType, double enginePower, double tireSize) {
        super(modelNumber, engineType, enginePower, tireSize);
    }

    public HeavyVehicle() {
        super();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String getModelNumber() {
        return super.getModelNumber();
    }

    @Override
    public Engine getEngineType() {
        return super.getEngineType();
    }

    @Override
    public double getEnginePower() {
        return super.getEnginePower();
    }

    @Override
    public double getTireSize() {
        return super.getTireSize();
    }

    @Override
    public void setModelNumber(String modelNumber) {
        super.setModelNumber(modelNumber);
    }

    @Override
    public void setEngineType(Engine engineType) {
        super.setEngineType(engineType);
    }

    @Override
    public void setEnginePower(double enginePower) {
        super.setEnginePower(enginePower);
    }

    @Override
    public void setTireSize(double tireSize) {
        super.setTireSize(tireSize);
    }

    @Override
    public String toString() {
        return "HeavyVehicle => modelNumber = " + this.getModelNumber() + ", engineType = " + this.getEngineType() + ", enginePower = " + this.getEnginePower() + ", tireSize = " + this.getTireSize() + ", weight = " + this.getWeight() + " ";
    }
}
