package com.example.StrategyPattern.withStrategyPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy{
    public void drive()
    {
        System.out.println("normal drive strategy");
    }
}
