package com.newYear.controller;

import com.newYear.models.NewYearTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ToysController {

    public static void addToys() {

        NewYearTree newYearTree = new NewYearTree(1, "Шар", "Красный");
        NewYearTree newYearTree1 = new NewYearTree(2, "Гирлянда", "Красный");
        NewYearTree newYearTree2 = new NewYearTree(3, "Гирлянда", "Красный");
        NewYearTree newYearTree3 = new NewYearTree(4, "Звезда", "Золотой");
        NewYearTree newYearTree4 = new NewYearTree(5, "Шар", "Синий");

        ArrayList<NewYearTree> newYearTrees = new ArrayList<>();
        newYearTrees.add(newYearTree);
        newYearTrees.add(newYearTree1);
        newYearTrees.add(newYearTree2);
        newYearTrees.add(newYearTree3);
        newYearTrees.add(newYearTree4);

        Collections.sort(newYearTrees, new Comparator<NewYearTree>() {
            @Override
            public int compare(NewYearTree o1, NewYearTree o2) {
                return o2.getColor().compareTo(o1.getColor());
            }
        });

        System.out.println(newYearTrees);

    }

    public static void countRed(String color) {
        NewYearTree newYearTree = new NewYearTree(1, "Шар", "Красный");
        NewYearTree newYearTree1 = new NewYearTree(2, "Гирлянда", "Красный");
        NewYearTree newYearTree2 = new NewYearTree(3, "Гирлянда", "Красный");
        NewYearTree newYearTree3 = new NewYearTree(4, "Звезда", "Золотой");
        NewYearTree newYearTree4 = new NewYearTree(5, "Шар", "Синий");

        ArrayList<NewYearTree> newYearTrees = new ArrayList<>();
        newYearTrees.add(newYearTree);
        newYearTrees.add(newYearTree1);
        newYearTrees.add(newYearTree2);
        newYearTrees.add(newYearTree3);
        newYearTrees.add(newYearTree4);
        int i = 1;

        for (NewYearTree array: newYearTrees
             ) {
            if (color.equals(array.getColor())) {
                System.out.println("Количество красных цветов: " + i++);
            }
            else {
                System.out.println("Извините такого цвета нет!");
            }
        }
    }
}
