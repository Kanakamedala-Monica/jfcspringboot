package com.jfcspringboot.jarray;
import java.util.Scanner;

class Student
{
	String name;
	int age;
	
	/**Student()
	{
		System.out.print("default");
	}*/
	
	Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	 
}

public class ArrayOfObjDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		int size=sc.nextInt(); //3
		Student[] students=new Student[size];
		
		for(int i=0;i<size;i++)
		{
			students[i]=new Student(sc.next(), sc.nextInt());
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.println(students[i].name+" "+students[i].age);
		}


	}

}
