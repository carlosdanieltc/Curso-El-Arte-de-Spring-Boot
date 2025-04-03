package com.debuggeandoideas.models;

public abstract class Stone {

    String color;
    String name;
    String location;
    Integer energyLevel;
    Integer numberOfSides;

    public Stone(String color, String name, String location, Integer energyLevel, Integer numberOfSides) {
        this.color = color;
        this.name = name;
        this.location = location;
        this.energyLevel = energyLevel;
        this.numberOfSides = numberOfSides;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(Integer energyLevel) {
        this.energyLevel = energyLevel;
    }

    public Integer getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(Integer numberOfSides) {
        this.numberOfSides = numberOfSides;
    }
}
