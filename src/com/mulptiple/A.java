package com.mulptiple;

public class A {
	
	
	public B m1()
	{
		try
		{ 
			
		    B b=new B();
		    b.x=20;
		    b.y=30;
			System.out.println("try start");
			int x=10/0;
			System.out.println("try end");
			return b;
		}
		catch(ArithmeticException e)
		{
			B b=new B();
			b.x=46;
			b.y=99;
	
		System.out.println("catch start");
		return b;
		}
	
	finally
	{
		System.out.println("finally block");
		
		{
			try
			{
				System.out.println("try 1");
				int x=10/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmatic");
			}
		}
		
		
	}
	}
public static void main(String[] args) {
	A a=new A();
	B b=(B)a.m1();
	System.out.println(b);
	System.out.println(b.x);
	System.out.println(b.y);
	
}	
}