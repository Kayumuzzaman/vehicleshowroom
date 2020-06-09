package org.dsi.vehiclemanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Kayumuzzaman Robin
 * @version 1.0
 * @since 2020-06-05
 */
public class VehicleApp {
    public static Scanner scanner = new Scanner(System.in);
    public static int expectedVisitors = 30;
    public static int engineType;

    public static Engine checkEngineType(int engineType) {
        if (engineType == 1) {
            return Engine.oil;
        } else if (engineType == 2) {
            return Engine.gas;
        } else if (engineType == 3) {
            return Engine.diesel;
        } else {
            System.out.println("Invalid input! there's no type such as: " + engineType + "! enter correct type again: ");
            engineType = scanner.nextInt();
            return checkEngineType(engineType);
        }
    }

    public static Vehicle checkVehicleType(NormalVehicle normalVehicle) {
        System.out.println("Enter model number (String): ");
        normalVehicle.setModelNumber(scanner.next());
        System.out.println("Enter value to set engine type: 1 for Oil || 2 for Gas || 3 for Diesel \n");
        engineType = scanner.nextInt();
        normalVehicle.setEngineType(checkEngineType(engineType));
        System.out.println("Enter engine power (double): ");
        normalVehicle.setEnginePower(scanner.nextDouble());
        System.out.println("Enter tire size (double): ");
        normalVehicle.setTireSize(scanner.nextDouble());
        return normalVehicle;
    }

    public static Vehicle checkVehicleType(SportsVehicle sportsVehicle) {
        System.out.println("Enter model number (String): ");
        sportsVehicle.setModelNumber(scanner.next());
        sportsVehicle.setEngineType(Engine.oil);
        System.out.println("Enter engine power (double): ");
        sportsVehicle.setEnginePower(scanner.nextDouble());
        System.out.println("Enter tire size (double): ");
        sportsVehicle.setTireSize(scanner.nextDouble());
        System.out.println("Enter the turbo value for vehicle (double): ");
        sportsVehicle.setTurbo(scanner.nextDouble());
        return sportsVehicle;
    }

    public static Vehicle checkVehicleType(HeavyVehicle heavyVehicle) {
        System.out.println("Enter model number (String): ");
        heavyVehicle.setModelNumber(scanner.next());
        heavyVehicle.setEngineType(Engine.diesel);
        System.out.println("Enter engine power (double): ");
        heavyVehicle.setEnginePower(scanner.nextDouble());
        System.out.println("Enter tire size (double): ");
        heavyVehicle.setTireSize(scanner.nextDouble());
        System.out.println("Enter the weight value for vehicle (double): ");
        heavyVehicle.setWeight(scanner.nextDouble());
        return heavyVehicle;
    }

    public static void main(String[] args) {
        boolean flag = true;
        boolean findModelNumber = false;
        int vehicleType;
        int inputValue;
        String removeVehicleWithModelNumber;

        ArrayList<Vehicle> vehicleArrayList = new ArrayList<>();

        while (flag) {
            System.out.println("Welcome to Vehicle Showroom. \n" +
                    "To add a vehicle enter 1. \n" +
                    "To remove a vehicle enter 2. \n" +
                    "To show list of vehicles with current expected visitor count enter 3. \n" +
                    "To show list of vehicles with details enter 4. \n" +
                    "To exit enter 5 \n");

            inputValue = scanner.nextInt();
            switch (inputValue) {
                case 1:
                    System.out.println("Enter vehicle type to add a vehicle: 1 to normal vehicle || 2 to add sports vehicle || 3 to add heavy vehicle \n");
                    vehicleType = scanner.nextInt();
                    if (vehicleType == 1) {
                        NormalVehicle normalVehicle = new NormalVehicle();
                        vehicleArrayList.add(checkVehicleType(normalVehicle));
                    } else if (vehicleType == 2) {
                        expectedVisitors = expectedVisitors + 20;
                        SportsVehicle sportsVehicle = new SportsVehicle();
                        vehicleArrayList.add(checkVehicleType(sportsVehicle));
                    } else if (vehicleType == 3) {
                        HeavyVehicle heavyVehicle = new HeavyVehicle();
                        vehicleArrayList.add(checkVehicleType(heavyVehicle));
                    } else {
                        System.out.println("Wrong type of vehicle! \n");
                    }
                    continue;

                case 2:
                    System.out.println("Enter the vehicle model number to remove vehicle: ");
                    removeVehicleWithModelNumber = scanner.next();
                    findModelNumber = false;
                    for (Vehicle vehicleModelCheck : vehicleArrayList) {
                        if (vehicleModelCheck.getModelNumber().equalsIgnoreCase(removeVehicleWithModelNumber)) {
                            findModelNumber = true;
                            if (vehicleModelCheck instanceof SportsVehicle) {
                                expectedVisitors = expectedVisitors - 20;
                            }
                            vehicleArrayList.remove(vehicleModelCheck);
                            System.out.println("Vehicle with model number: " + removeVehicleWithModelNumber + " has been removed \n");
                            break;
                        }
                    }
                    if (!findModelNumber) {
                        System.out.println("Vehicle with model number: " + removeVehicleWithModelNumber + " is not available, so it can't be removed! \n");
                    }
                    continue;

                case 3:
                    if(vehicleArrayList.isEmpty()) {
                        System.out.println("There is no vehicle right now!");
                    } else {
                        System.out.println("Vehicle list (model numbers): ");
                        for (Vehicle vehicle : vehicleArrayList) {
                            System.out.println(vehicle.getModelNumber());
                        }
                    }
                    System.out.println("And expected visitors are: " + expectedVisitors + "\n");
                    break;

                case 4:
                    if(vehicleArrayList.isEmpty()) {
                        System.out.println("There is no vehicle right now! \n");
                    } else {
                        System.out.println("Vehicle list with details: \n");
                        for (Vehicle vehicle : vehicleArrayList) {
                            System.out.println(vehicle + "\n");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting from vehicle showroom...");
                    flag = false;
                    break;

                default:
                    System.out.println("No such choice" + "\n");
            }
        }
    }
}

