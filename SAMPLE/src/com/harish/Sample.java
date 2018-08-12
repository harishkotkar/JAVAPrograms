package com.harish;


class A
{
	int a=1;
	private int b=1;
	static int c=1;
	final  int d=1;
	public void display()
	{
		System.out.println("parent");
	}
	public void display2()
	{
		System.out.println("parent");
	}
	public static void staticDisplay()
	{
		System.out.println("static parent");
	}
	
}

class B extends A
{
	int a=2;
	private int b=2;
	static int c=2;
	final  int d=2;
	
	
	public void display()
	{
		System.out.println("child");
	}
	public void display3()
	{
		System.out.println("child");
	}
	public static void staticDisplay()
	{
		System.out.println("static child");
	}
}


public class Sample 
{
	public static void main(String args[])
	{
		A a = new A();
		System.out.println(a.a);
		//System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
		a.display();
		a.display2();
		
		System.out.println("-----------------");
		B b = new B();
		System.out.println(b.a);
		//System.out.println(b.b);
		System.out.println(b.c);
		System.out.println(b.d);
		b.display();
		b.display3();
		
		
		System.out.println("-----------------");
		A ab = new B();
		System.out.println(ab.a);
		//System.out.println(ab.b);
		System.out.println(ab.c);
		System.out.println(ab.d);
		ab.display();
		ab.display2();
		//ab.display3();
	}
}
