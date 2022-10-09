class A
{
	int x;
	A(int a)
	{
		x=a;
	}
}
class B extends A
{
	int y;
	B(int a,int b)
	{
		super(a); //super() calls the constructor of the class A
		y = b;
	}
	void display()
	{
		System.out.println("X :" + x);
		System.out.println("Y :" + y);
	}
}
public class demo20 
{
	public static void main(String[] args)
	{
		B obj = new B(100,900);
		obj.display();
	}

}
