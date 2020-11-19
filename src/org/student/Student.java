package org.student;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter the Student ID:");
		int stuid=s.nextInt();
		System.out.println("Enter the Student Name:");
		String name=s1.nextLine();
		System.out.println("Enter the Student Email:");
		String email=s1.nextLine();
		System.out.println("Enter the Student Phone no:");
		long ph1=s.nextLong();
		System.out.println("Enter the Student Dept:");
		String dept=s1.nextLine();
		System.out.println("Enter the Student Gender:");
		char g1=s2.next().charAt(0);
		System.out.println("Enter the Student City:");
		String c1=s1.nextLine();
		System.out.println("Enter the Student ID:"+stuid);
		System.out.println("Enter the Student Name:"+name);
		System.out.println("Enter the Student Email:"+email);
		System.out.println("Enter the Student Phone no:"+ph1);
		System.out.println("Enter the Student Dept:"+dept);
		System.out.println("Enter the Student Gender:"+g1);
		System.out.println("Enter the Student City:"+c1);
		
	}
}
