package com.capgemini.asses;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12,12,"red");
        Rectangle rectangle1 = new Rectangle(10,3,"blue");
        Rectangle rectangle2 = new Rectangle(6,5,"yellow");
        System.out.println("calculateCircumFerence "+ rectangle.calculateCircumFerence());
        System.out.println("Calculatesurface:" + rectangle.calculateSurface());

        System.out.println("Calculate surfeace Rectangle1: " +rectangle1.calculateSurface());
        System.out.println("Calculate surfeace Rectangle2: " +rectangle2.calculateSurface());
        System.out.println("calculate Circumference Rectangle1: " +rectangle1.calculateCircumFerence());
        System.out.println("calculate Circumference Rectangle2: " +rectangle2.calculateCircumFerence());

        System.out.println(rectangle);


    }
}
