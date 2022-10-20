package com.bean;

public class Emp {

		int id;
		String name;
		Address address;
		
		public Emp(int id,String name,Address address)
		{
			this.id = id;
			this.name = name;
			this.address = address;
		}
		void display()
		{
			System.out.println(""+id +""+name);
			System.out.println(address.city + "" + address.state + "" + address.country);
		}
		public static void main(String[] args) 
		{
			Address add = new Address("Mumbai","Maharatra","China");
			Address add2 =new Address("Surat","Tokyo","America");
			
			Emp e1 = new Emp(111,"Parv",add);
			Emp e2 = new Emp(112,"Parv2",add2);
			
			e1.display();
			e2.display();
		}
		
}
