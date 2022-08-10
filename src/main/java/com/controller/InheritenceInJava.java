package com.controller;

import java.util.Scanner;

class GrandFather 
{

	public int add(int a,int b)
	{
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		a  = sc.nextInt();
		System.out.println("Enter b");
		b= sc.nextInt();
		c = a+b;
		return c;
	}
}
class Parent extends GrandFather 
{
	public int sub()
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);		
		return c;
		
	}
}
class Child extends Parent  
{}

public class InheritenceInJava {

	public static void main(String[] args) 
	{
		int p = 0,q = 0;
		Scanner sc = new Scanner(System.in);
		Child obj = new Child();
		int ans =obj.add(p, q);
		int ans1 = obj.sub();
		System.out.println("Addition is  :"+ans);
	}
}
/*Code Reusability inheritance is helpful
 * Types : 
 *  	1) Single Inheritance : One Parent and One child 
 *  	2) Multiple Inheritance(Interface)(Not supported by class) : When there are more than one parent class 
 *          and only one child 
 *  	3) Multilevel inheritance : There will be one grand Child  child class and one parent class
 *  		grand child -> child class -> parent class
 *  	4) Hierarchical inheritance : there will be one parent class and more than one child classes.
 *  	5) Hybrid Inheritance : THere will be combination of more than one type of inheritance.
 * 
 */

