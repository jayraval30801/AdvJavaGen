package com.controller;

public class ControlStatement {

		public static void main(String[] args) 
		{
				int i,k,j;
				for(i=1;i<=5;i++)  //i=1
				{
					for(k=5;k>=i;k--) //k=4 4>=1 3>=1 2>=1 0>=1 
					{
						System.out.print(" ");
					}
					for(j=1;j<=i;j++)  //j=2 2<=1  
					{
						System.out.print("* ");
					}
					System.out.println();
				}
		
		}
}
/*
 * Scanner = Enter range odd value print => 
 * 15 => 1-15 => odd value printf using for loop
 * user input Enter value = > Table print
 *  user 3  
 *   3   1   3
 *   3   2   6
 *   3   3   9
 *   3   4   12
 *   3   5   15
 *    
 *   
 * */
/*
COntrol Statement:
		1) If Else   ...
		2) Nested If Else
Switch  Statement: Done
Loops: 
	1) Entry control : for while 
		for()
		
		
	2) Exit control : do while
	
*/
/*
 *  for(declaration;condition;incre/decre op)
 *  {
 *  	statement;
 *  }
 *  10
 * */
 /*

*     *
*    * *
*   * * *  
*  * * * *  
* * * * * * 
*  * * * * 
*   * * *
*	 * *
	  *
*
*/  

