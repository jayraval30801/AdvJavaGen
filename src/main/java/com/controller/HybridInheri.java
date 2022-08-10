package com.controller;

class Dog
{
		void display()
		{
			System.out.println("Dog class Called");	
		}

}
class  Child3 extends Dog
{
	
}
class Child2 extends Dog
{
	void display1()
	{
		System.out.println("Display1 Method Called");
		
	}
	
}
class SubChild extends Child3
{
		
}
class SubChild1 extends Child2
{
	
}


public class HybridInheri {

		
		public static void main(String[] args) {
				SubChild obj = new SubChild();
				SubChild1 obj1 = new SubChild1();
				obj1.display1();
				obj.display();
				
		}
}

/*Combination of more than two types of inheritance. Hybrid 
 * 			
 * 			parent =>  1) Child1 => SubChild(Single)  2) Child2 (Hierarchical)
 * 				
 * 
 * */
