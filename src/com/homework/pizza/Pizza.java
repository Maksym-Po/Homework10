package com.homework.pizza;

/**
 * В этом классе поля и создаем консруктор внутри вычисляем диаметр
 */
public class Pizza {

    private Circle basis;
    private String composition;
    private String name;
    private double cost;

    public void setBasis(Circle basis) {
        this.basis = basis;
    }

    public Pizza(String composition, String name, double cost) {

        this.composition = composition;
        this.name = name;
        this.cost = cost;
        setBasis(new Circle(10));
    }
}


