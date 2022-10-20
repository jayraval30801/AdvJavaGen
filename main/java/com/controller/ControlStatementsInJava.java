package com.controller;

import java.util.Scanner;

public class ControlStatementsInJava 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("Enter Your age");
		age = sc.nextInt();
		if(age>18)
		{
			System.out.println("You are eligible for vote");
			//statement
			
		}else
		{
			System.out.println("You are not eligible for vote");
			//statement
		}
	}
		
}
/*
 * Control Statement:
 * 		1) If else Statement:
 * 					1) If else 
 * 					2) nested If else
 * 					3) Nested If
 * 		2) Switch Statement:
 * 		3) Loop statement:
 * 				1) For loop
 * 				2) While loop
 * 				3) Do while loop
 * */
