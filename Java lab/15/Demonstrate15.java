class A
{
	int i;
}
class B extends A
{
	int j;
	void sum()
	{
		System.out.println("i+j : " + (i+j));
	}
}
public class Demonstrate15 
{
	public static void main(String[] args)
	{
		B b = new B();
		b.i=10;
		b.j=90;
		b.sum();
	}

}
