package com.controller;
class GrandParent
{
	//Addition of two number 
	void display()
	{
		System.out.println("G P display Method called");
	}	
	//Substraction of two number 
}
class Parent1 extends GrandParent
{
	//Multiplication of two 
	//Division of number
	void display1()
	{
		System.out.println("P Display Method Called");
	}
}
class Child1 extends Parent1
{
	//object => parent => grandparent methods 
	void display2()
	{
		System.out.println("Child Method Called");
	}
}

public class MultiInher 
{
	public static void main(String[] args) 
	{
		GrandParent obj = new GrandParent();
		obj.display();
	}
}
