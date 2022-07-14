package com.homework.circle;

public class Circle {

    private static int radius;
    private double lc;
    private double sc;
    private static String col;
    private static int basis;

    public static int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static String getCol() {
        return col;
    }

    public static int getBasis() {
        return basis;
    }

    public void setBasis(int basis) {
        this.basis = basis;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int radius, String col) {
        this.radius = radius;
        this.col = col;
    }

    public Circle() {

        lc = (2 * radius * Math.PI);
        sc = Math.PI * (Math.pow(Circle.getRadius(), 2));

        System.out.println(Circle.getCol());
        System.out.println("Square" + sc + " length " + lc + " color " + Circle.getCol());

        this.lc = lc;
        this.sc = sc;
    }
}