package com.company.java;

public class Triangle extends Figure{
    public Triangle(double d1, double d2) {
        super(d1, d2);
    }

    @Override
    void area() {
        System.out.println("The area of Triangle is : "+(d1*d2)/2);
    }
}
