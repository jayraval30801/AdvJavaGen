package com.controller;
import java.util.Scanner;

public class Tenor {
	public static void main(String args[])
	{
			int i,j,row; 
			Scanner sc  = new Scanner(System.in); 
			System.out.println("How much rows you want in Pattern");
			row = sc.nextInt();   //row = 2   
			for(i=1;i<=row;i++)  // i=3 3<=2 false
			{
					for(j=1;j<=i;j++)  //j=3 3<=2 false 
					{
						System.out.print("*");
					}
				System.out.println("");
			}
	}
}
 /*
*
**

*/