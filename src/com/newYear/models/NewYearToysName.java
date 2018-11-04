package com.newYear.models;

import com.newYear.enum_pack.ColoursEnum;

public class NewYearToysName implements Comparable<NewYearToysName> {

    private ColoursEnum colour;
    private String name;

    public NewYearToysName(ColoursEnum colour, String name) {
        this.colour = colour;
        this.name = name;
    }

    public ColoursEnum getColour() {
        return colour;
    }

    public void setColour(ColoursEnum colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NewYearToysName{" +
                "colour=" + colour +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(NewYearToysName o) {
        return colour.toString().compareTo(o.colour.toString());
    }
}
