class YCR
{
	int i;
	void set_data(YCR o)
	{
		i = o.i;
	}
	void display()
	{
		System.out.print("i : " + i);
	}
}
public class Example_3
{
	public static void main(String[] args)
	{
		YCR obj1 = new YCR();
		YCR obj2 = new YCR();
		obj1.i=10;
		obj2.set_data(obj1); //Pass by Reference
		obj2.display();
	}

}
