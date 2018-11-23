package com.company.java;

public class Rectangle extends Figure {
    public Rectangle(double d1, double d2) {
        super(d1, d2);
    }
    @Override
    void area() {
        System.out.println("The area of rectangle is : "+(d1*d2));
    }
}
