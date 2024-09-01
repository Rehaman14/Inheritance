package Inheritance;

class Alpha
{
	public Alpha(int x) {
		super();
		System.out.println("Alpha class"+x );
	}
}
class Beta extends Alpha
{
	public Beta ()
	{
		super(9);//parameterized constructor of super class//
		System.out.println("sub class Beta constructor" );
	}
}


public class ConstructorDemo {


public static void main(String[] args)
{
 new Beta();
}
}