package com.example.StrategyPattern.withStrategyPattern;

import com.example.StrategyPattern.withStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObject;

    public Vehicle(DriveStrategy driveObject) {
        this.driveObject = driveObject;
    }

    public void drive()
    {
        driveObject.drive();
    }
}