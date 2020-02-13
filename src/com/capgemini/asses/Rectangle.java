package com.capgemini.asses;

public class Rectangle {
    private int height;
    private int width;
    private String color= "no color";


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle(int height, int width, String color) {
        this.height = height;
        this.width = width;
        this.color =color;

    }
    public int calculateSurface(){
        return height*width;
    }

    public int calculateCircumFerence(){
        return (2*height +2*width);

    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", color='" + color + '\'' +
                ", Circumference=" + calculateCircumFerence() + '\'' +
                ", surface=" + calculateSurface() + '\'' +
                '}';
    }
}