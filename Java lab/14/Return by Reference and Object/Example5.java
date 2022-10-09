class YCR
{
	int i;
	YCR Copy()
	{
		YCR temp = new YCR();
		temp.i = i;
		return temp;
	}
	void display()
	{
		System.out.println("i : "+ i);
	}
}
public class Example5
{
	public static void main(String[] args)
	{
		YCR obj1 = new YCR();
		obj1.i=100;
		YCR obj2 = obj1.Copy(); //Return by Reference
		obj1.display();
		obj2.display();
	}

}
