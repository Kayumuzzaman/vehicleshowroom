package org.dsi.vehiclemanagementsystem;

public abstract class Vehicle {
    private String modelNumber;
    private Engine engineType;
    private double enginePower;
    private double tireSize;

    public Vehicle(String modelNumber, Engine engineType, double enginePower, double tireSize) {
        this.modelNumber = modelNumber;
        this.engineType = engineType;
        this.enginePower = enginePower;
        this.tireSize = tireSize;
    }

    public Vehicle() {
    }

    public String getModelNumber() {
        return this.modelNumber;
    }

    public Engine getEngineType() {
        return this.engineType;
    }

    public double getEnginePower() {
        return this.enginePower;
    }

    public double getTireSize() {
        return this.tireSize;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public void setEngineType(Engine engineType) {
        this.engineType = engineType;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public void setTireSize(double tireSize) {
        this.tireSize = tireSize;
    }

    public String toString() {
        return "Vehicle => modelNumber=" + this.getModelNumber() + ", engineType=" + this.getEngineType() + ", enginePower=" + this.getEnginePower() + ", tireSize=" + this.getTireSize() + " ";
    }
}
