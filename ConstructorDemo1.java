package Inheritance;

class parent
{
	public parent()
	{
		System.out.println("Super class no argument constructor!!");
	}
	public parent(String str) {
		this();
		System.out.println("Super class Parameterized constructor!!"+str);
	}
}
class Child extends parent 
{
	public Child() {
		super("Batch 30");
		 System.out.println("Sub class no argument constructor!!");	
	}  	
}
public class ConstructorDemo1 {

	public static void main(String[] args)
	{
		new Child();
	}	
  }
