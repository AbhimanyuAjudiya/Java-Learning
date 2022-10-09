class YCR
{
	int i;
	void setdata(int a)
	{
		i=a;
	}
	void display()
	{
		System.out.print("i:"+i);
	}
}
public class Example2 
{
	public static void main(String[] args)
	{
		YCR obj=new YCR();
		obj.setdata(8);
		obj.display();
	}
}
