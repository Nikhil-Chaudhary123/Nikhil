package com.mulptiple;

public class F {
	
	
	public static void main(String[] args) {
		
		try
		{
			System.out.println("try start");
			int x=10/2;
			
			try
			{
				System.out.println("try 2 start");
				int y=10/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println("catch block 2");
			}
			finally
			{
				System.out.println("finally block");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch block");
		}
		finally
		{
			System.out.println("finally block");
			try
			{
				System.out.println("try start");
				int x=10/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println("catch block finally");
			}
			finally
			{
				System.out.println("finally last");
			}
		}
		
	}
	
	
	
	

}
