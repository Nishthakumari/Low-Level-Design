package com.example.StrategyPattern.withStrategyPattern;

import com.example.StrategyPattern.withStrategyPattern.Strategy.SportsDriveStrategy;

public class SportVehicle extends Vehicle{

    public SportVehicle() {
        super(new SportsDriveStrategy());
    }
}
