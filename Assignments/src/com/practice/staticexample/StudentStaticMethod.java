package com.practice.staticexample;

class StudentStaticMethod {
	int rollno;
	String name;
	static String college = "ITS";

	static void change() {
		college = "BBDIT";
	}

	StudentStaticMethod(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

	public static void main(String args[]) {
		

		StudentStaticMethod s1 = new StudentStaticMethod(111, "Karan");
		StudentStaticMethod s2 = new StudentStaticMethod(222, "Aryan");
		StudentStaticMethod s3 = new StudentStaticMethod(333, "Sonoo");

		s1.display();
		s2.display();
		s3.display();

		StudentStaticMethod.change();

		s1.display();
		s2.display();
		s3.display();
	}
}