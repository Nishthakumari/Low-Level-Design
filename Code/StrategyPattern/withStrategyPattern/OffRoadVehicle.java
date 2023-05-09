package com.example.StrategyPattern.withStrategyPattern;

import com.example.StrategyPattern.withStrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }

}
