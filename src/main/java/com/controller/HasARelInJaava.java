package com.controller;

class Address
{
		void display()
		{
			System.out.println("Address Class Called");
		}
}
class Employee 
{

	int id;
	String name;
	Address address; //aggregation  
	
	void display2()
	{
		address = new Address();
		address.display();
	}
}

public class HasARelInJaava {

	public static void main(String[] args) {
		
		Employee obj = new Employee();
		obj.display2();
		//obj.display();
	}
	
	
}
