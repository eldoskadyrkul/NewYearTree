package com.newYear.models;

import java.util.Objects;

public class NewYearTree {

    private int id;
    private String toys_igrushka;
    private String color;

    public NewYearTree(int id, String toys_igrushka, String color) {
        this.id = id;
        this.toys_igrushka = toys_igrushka;
        this.color = color;
    }

    public NewYearTree()
    {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewYearTree that = (NewYearTree) o;
        return Objects.equals(color, that.color);
    }

    @Override
    public String toString() {
        return String.format("NewYearTree{id=%s, toys_igrush=%s, color=%s}", id, toys_igrushka, color);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToys_igrushka() {
        return toys_igrushka;
    }

    public void setToys_igrushka(String toys_igrushka) {
        this.toys_igrushka = toys_igrushka;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
