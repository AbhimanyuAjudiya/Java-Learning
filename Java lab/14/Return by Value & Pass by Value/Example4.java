class YCR
{
	int i;
	void set_data(int a)
	{
		i=a;
	}
	int incrByOne()
	{
		i++;
		return (i);
	}
}
public class Example4
{
	public static void main(String[] args)
	{
		YCR obj1 = new YCR();
		obj1.set_data(11); //Pass by Value
		int value = obj1.incrByOne(); // Return by Value
		System.out.println("i : " + value);
	}

}
