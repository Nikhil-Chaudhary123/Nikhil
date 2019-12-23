package package2;

import package1.A;

public class B extends A{
	
	
	protected void m2()
	{
		m1();
		System.out.println(super.x);
		System.out.println("m1 of ");
	}
public static void main(String[] args) {
	
	 A a=new A();
	  B b=new B();
	  b.m1();
	  System.out.println(b.x);
	  A a1=new B();
	  System.out.println(a.x);
	
}
}
