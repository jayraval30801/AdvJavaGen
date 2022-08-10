package com.controller;

class Student
{
		int rollNo ;
		String name;
		int std;
	 Student(int rollNo ,String name , int std)
	{	
		this.rollNo = rollNo;
		this.name = name;
		this.std = std;
	}
	 void display()
	 {
		 System.out.println( "Roll No is :"+rollNo + "Name is:"+ name+  "Standrad:" + std);
	 }
}
public class ThisKey
{
		public static void main(String[] args) 
		{
			Student st = new Student(101,"Parv",12);
			st.display();
			
		}
}
//Using Static Method and Scanner class And Print Cube of given number.



