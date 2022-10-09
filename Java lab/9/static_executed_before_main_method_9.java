
public class static_executed_before_main_method_9
{
	static
	{
		System.out.println("hello");
	}
	
	public static void main(String args[])
	{
		System.out.println("hii");
	}
	static 
	{
		System.out.println("hello2");
	}

}
