package com.practice.thisExample;

/**
 * Created by awmishra on 2/16/2017.
 */
public class Example {
    int rollNo;
    String firstName;
    String lastName;

    Example(int rollNo, String firstName, String lastName) {
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void display() {
        System.out.println("First Name "+firstName+ " Last Name "+lastName);
    }

    public static void main (String []args) {
        Example example1 = new Example(1, "Awanish", "Misra");
        Example example2 = new Example(2, "Divya", "Mishra");
        example1.display();
        example2.display();
    }
}
