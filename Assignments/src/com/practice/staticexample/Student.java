package com.practice.staticexample;

class Student{  
 int rollno;  
 String name;  
 static String college ="ITS";  
   
 Student(int r,String n, String c){  
 rollno = r;  
 name = n;  
 college = c;
 }  
void display (){System.out.println(rollno+" "+name+" "+college);}  

public static void main(String args[]){  
Student s1 = new Student(111,"Karan","BBD");  
Student s2 = new Student(222,"Aryan","DDB");  
 
s1.display();  
s2.display();  
}  
}  