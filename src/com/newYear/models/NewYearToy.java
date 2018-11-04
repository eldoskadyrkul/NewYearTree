package com.newYear.models;

import com.newYear.enum_pack.ColoursEnum;


public class NewYearToy implements Comparable<NewYearToy> {

    private ColoursEnum colour;

    public NewYearToy(ColoursEnum colour) {
        this.colour = colour;
    }

    public ColoursEnum getColour() {
        return colour;
    }

    public void setColour(ColoursEnum colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "NewYearToy{" +
                "colour=" + colour +
                '}';
    }

    @Override
    public int compareTo(NewYearToy o) {
        return colour.toString().compareTo(o.colour.toString());
    }
}
