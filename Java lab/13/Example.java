final class FinalDemo			//This class cannot be inherited
{
	final double PI=3.14159;		//This variable cannot be changed
	final void display()			//This method cannot be overriden
	{
		System.out.println("PI : " + PI);
		//PI = 100; Not Allowed
	}
}
public class Example
{
	public static void main(String[] args)
	{
		FinalDemo obj = new FinalDemo();
		obj.display();
	}
}
