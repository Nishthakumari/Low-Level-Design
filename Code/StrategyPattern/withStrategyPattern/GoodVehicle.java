package com.example.StrategyPattern.withStrategyPattern;

import com.example.StrategyPattern.withStrategyPattern.Strategy.NormalDriveStrategy;

public class GoodVehicle extends Vehicle{

    public GoodVehicle() {
        super(new NormalDriveStrategy());
    }
}
