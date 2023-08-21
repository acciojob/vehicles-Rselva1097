package com.driver;

public class Boat implements  WaterVehicle{
    private String name;
    private int capacity;

    public int getVehicleCapacity(){
        return this.capacity;
    }
    public String getVehicleName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
