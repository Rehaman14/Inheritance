package Inheritance;

class A
{
	public A() {
		System.out.println("class A");
	}
}
class B extends A{
	public B()
	{
		System.out.println("class B");
		
	}
}


public class Class_a 
{
	public static void main(String[] args)
	{
		new B();
	}
}
