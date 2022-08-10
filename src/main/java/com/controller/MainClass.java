package com.controller;
/*
 * Oops Concept Part:
 * Inheritance : 
 * 	    Base class(Methods Classes ) Properties Acquire By Derived Class. 
 * 		Class Base(Parent)  Derived(Child).
 * Types in Inheritence:
 * 	1) Single Inheritance.  Class A -> Class B
 * 	2) MultiLevel Inheritance. Class A -> Class B -> Class C  
 * 	3) Multiple Inheritance. Not Possible
 *  4) Heirarchical Inheritance. Class A -> Class B, Class,C
 *  5) Hybrid Inheritance. => Class A -> Class B -> Class C , Class D
 *  Inheritance Provides Code Reusability. 
 *  Class A(Method )  -> Class C , Class D 
 *  
 * 	Keyword Class Relationship  extends 	
 * 
 * */
class Base//parent
{
	int a =12,b=3,c;
	void add()
	{	
	  c= a+b;
	}
	void display()
	{
		System.out.println("c:"+c);
	}
}
class Derived extends Base //Child 
{

}
public class MainClass
{
	public static void main(String[] args) 
	{
		Derived obj = new Derived();
		obj.add();
		obj.display();
	}
}

