package com.controller;

class ParentMain
{
	void Display()
	{
		System.out.println("Display Method Called");
	}
	void prime()
	{
		
	}
	/* Method Create => 
	 * 1 => Addition => No arg no return 
	   2 => Subtraction  => no arg with return
	   3 => Multiplication => with arg no return
	   4 => Division => with return with arg
	*/
class ChildMain extends ParentMain
{}

class Child2 extends ParentMain
{}
class Child3 extends ParentMain
{}
class Child4 extends 
{}
public class HeirarInheri 
{
	public static void main(String[] args) 	
	{
		ChildMain obj = new ChildMain();
		Child2 obj2 = new Child2();
		Child3 obj3 = new Child3();
		obj.Addition();
		obj2.Subsratction();
		obj3.Mutilplication();
		obj4.Division();
		
	}
}
