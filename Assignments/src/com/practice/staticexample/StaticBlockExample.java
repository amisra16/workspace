package com.practice.staticexample;

/**
 * Created by awmishra on 2/16/2017.
 */
public class StaticBlockExample {
    int i = 0;
    static {
        System.out.println("Printing static block");
    }

    public StaticBlockExample () {
        System.out.println("Calling Default Constructor");
    }

    void print() {
        System.out.println("calling method");
    }

    static void staticPrint() {
        System.out.println("calling static method");
    }

    //Instance block is called when instance is created
    {
        System.out.println("Printing 1 instance block with counter "+i);
        i++;
        System.out.println("Printing 1 instance block with counter after increment "+i);
    }

    public static void main (String args[]) {
        StaticBlockExample staticBlockExample = new StaticBlockExample();
        StaticBlockExample.staticPrint();
//        staticBlockExample.print();
    }
}


