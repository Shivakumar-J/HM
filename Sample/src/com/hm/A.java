package com.hm;
import java.util.*;
public class A {
	int id;
	String name;

	public A() {
		// TODO Auto-generated constructor stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter id and name");
		id = sc.nextInt();
		name =  sc.next();
		System.out.println("My ID is: "+ id + "\nMy name is : "+name);
		
		
//		System.out.println("\nEnter Age and Salary as well");
//		int age = sc.nextInt();
//		int salary = sc.nextInt();
//		System.out.println("age is : "+age + "\nsalary is : "+salary);
	}
	
	void display() {
		System.out.println("Hello, " + name);
	}

}
