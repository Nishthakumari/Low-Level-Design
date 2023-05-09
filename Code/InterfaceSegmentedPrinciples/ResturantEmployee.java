package com.example.InterfaceSegmentedPrinciples;

public interface ResturantEmployee {

    void washDishes();
    void serveCustomers();
    void cookFood();

}

class Waiter implements ResturantEmployee{

    public void washDishes() {
        //not my job
    }

    public void serveCustomers() {
        //yes and here is my implementation
        System.out.println("serving the customer");
    }

    public void cookFood() {
        //not my job
    }
}


interface WaiterInterface{
    void serveCustomers();
    void takeOrders();
}

interface chefInterface{
    void cookFood();
    void decideMenu();

}

class Waiter1 implements WaiterInterface{

    public void serveCustomers() {
        System.out.println("Serving the customer");
    }

    public void takeOrders() {
        System.out.println("taking the orders");
    }
}

