package com.company.java;

public abstract class Figure {
    double d1,d2;
    public Figure(double d1,double d2) {
        this.d1=d1;
        this.d2=d2;
    }
    abstract void area();
    //If it is not abstract then it shows area method of this class
    // But here is nothing to do in area method
    //An abstract class cannot be instantiate
    //so that's why we don't call the Figure class area() method
    /*{
        System.out.println("Sorry..Undefined method.");
    }*/
}
