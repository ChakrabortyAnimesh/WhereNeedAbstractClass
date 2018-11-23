package com.company.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Figure f;
        Rectangle rectangle = new Rectangle(10, 20);
        f=rectangle;
        f.area();
        Triangle triangle = new Triangle(10, 10);
        f=triangle;
        f.area();

    }
}
