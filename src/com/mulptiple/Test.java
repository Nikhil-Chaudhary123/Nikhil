package com.mulptiple;

public class Test {
	
	int x=100;
	public C m1()
	{
	C c=new C();
	{
		try
		{
			
			int i=30;
			int j=40;
			System.out.println("try start");
			int x=10/0;
			return c;
		}
	     
		catch(ArithmeticException e)
		
		{
			
			
			int i=50;
			int j=60;
			System.out.println("catch block");
		return c;
		}
finally

{ 
	
	
	int i=80;
	int j=100;
	System.out.println("finally block");
	return c;
}
	}
}
	public static void main(String[] args) {
		
	
Test t=new Test();
   C x=(C)t.m1();
System.out.println(x);
System.out.println(x.i);
System.out.println(x.j);

	}}