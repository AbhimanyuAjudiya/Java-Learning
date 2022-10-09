class A
{
	int x;
}
class B extends A
{
	int x;
	B(int a,int b)
	{
		super.x = a; //super.x refers variable x of class A
		x = b; // x refers to variable x of class B
	}
	void display()
	{
		//super.x prints value of variable x of class A
		System.out.println("X of A :" + super.x);
		//x prints value of variable x of class B
		System.out.println("X of B :" + x);
	}
}
public class demo19
{
	public static void main(String[] args)
	{
		B obj = new B(10,60);
		obj.display();
	}

}
