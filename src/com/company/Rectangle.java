package com.company;

public class Rectangle {

    public double length;
    public double width;

    public Rectangle() {
        length = 5;
        width = 5;
    }

    public double rectangleArea(double length, double width) {
        double area = length * width;
        return area;
    }

    public double getLength() {
        return length;
    }

    public double width() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
