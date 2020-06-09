package org.dsi.vehiclemanagementsystem;

public class NormalVehicle extends Vehicle {

    public NormalVehicle(String modelNumber, Engine engineType, double enginePower, double tireSize) {
        super(modelNumber, engineType, enginePower, tireSize);
    }

    public NormalVehicle() {
        super();
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
        return "NormalVehicle => modelNumber = " + this.getModelNumber() + ", engineType = " + this.getEngineType() + ", enginePower = " + this.getEnginePower() + ", tireSize = " + this.getTireSize() + " ";
    }
}
