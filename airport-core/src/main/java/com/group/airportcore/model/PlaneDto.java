package com.group.airportcore.model;

// Data Transfer Object
public class PlaneDto {
    String name;
    int enginesCount;

    public PlaneDto(String name, int enginesCount) {
        this.name = name;
        this.enginesCount = enginesCount;
    }

    public String getName() {
        return name;
    }

    public int getEnginesCount() {
        return enginesCount;
    }
}
