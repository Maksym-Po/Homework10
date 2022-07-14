package com.homework.pizza;

/**
 * Создаем пицы и создаем массив.
 */

public class Pizzeria {

    private Pizzeria[] pizza;

    public static void main(String[] args) {

        Pizza peperoni = new Pizza("peperoni,tomato,chis,paper", "peperoni", 220);
        Pizza ches = new Pizza("ches,tomato,mozzarella", "3Chese", 140);
        Pizza havai = new Pizza("pineapple,ches,chicken,tomato", "havai", 190);
        Pizza[] pizza = {peperoni, ches, havai};

        for (int i = 0; i < 3; i++) {

            System.out.println(pizza[i]);
        }
    }
}
