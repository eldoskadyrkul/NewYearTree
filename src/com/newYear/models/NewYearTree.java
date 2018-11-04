package com.newYear.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewYearTree {

    private int id;
    private List<NewYearToy> toys;

    public NewYearTree(int id, List<NewYearToy> toys) {
        this.id = id;
        this.toys = toys;
    }

    public NewYearTree()
    {
        toys = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<NewYearToy> getToys() {
        return toys;
    }

    public void setToys(List<NewYearToy> toys) {
        this.toys = toys;
    }

    @Override
    public String toString() {
        return "NewYearTree{" +
                "id=" + id +
                ", toys=" + Arrays.toString(toys.toArray()) +
                '}';
    }

    public void addToy(NewYearToy toy) {
        toys.add(toy);
    }
}
