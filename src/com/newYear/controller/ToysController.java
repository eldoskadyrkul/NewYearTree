package com.newYear.controller;

import com.newYear.enum_pack.ColoursEnum;
import com.newYear.models.NewYearToy;
import com.newYear.models.NewYearTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToysController {

    public static void addToys() {

        NewYearToy blackToy = new NewYearToy((ColoursEnum.BLACK));
        NewYearToy whiteToy = new NewYearToy(ColoursEnum.WHITE);
        NewYearToy redToy = new NewYearToy(ColoursEnum.RED);
        NewYearToy blueToy = new NewYearToy((ColoursEnum.BLUE));
        NewYearToy redToy2 = new NewYearToy(ColoursEnum.RED);

        List<NewYearToy> toys = new ArrayList<>();
        toys.add(blackToy);
        toys.add(whiteToy);
        toys.add(redToy);
        toys.add(blueToy);
        toys.add(redToy2);

        NewYearTree elka = new NewYearTree(1, toys);
        elka.addToy(new NewYearToy(ColoursEnum.RED));

        NewYearTree elka2 = new NewYearTree();
        elka2.addToy(new NewYearToy(ColoursEnum.BLUE));





    }

    public static int countNumbersRed(NewYearTree elkd, final ColoursEnum coloursEnum) {
        int counter = 0;
        for (NewYearToy newYearToy : elkd.getToys()) {
            if (coloursEnum == newYearToy.getColour()) {
                counter++;
            }
        }
        return counter;
    }

    /* public static void countRed(String color) {
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
    }*/
}
