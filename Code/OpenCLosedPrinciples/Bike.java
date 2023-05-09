package com.example.OpenCLosedPrinciples;

public interface Bike {
    void turnOnEngine();
    void accelerate();

}

class Motorcycle implements Bike{

    boolean isEngineOn;
    int speed;

    public void turnOnEngine() {
        //turn on Engine
        isEngineOn = true;
    }

    public void accelerate() {
        //increase the speed
        speed = speed +10;
    }
}

class Bicycle implements Bike{

    public void turnOnEngine() {
        throw new AssertionError("there is no engine");
    }

    public void accelerate() {
        //do something
    }
}
