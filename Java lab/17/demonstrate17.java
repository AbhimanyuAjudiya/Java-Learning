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
class C extends A
{
	int k;
	void sum()
	{
		System.out.println("i+k : " + (i+k));
	}
}
public class demonstrate17 
{
	public static void main(String[] args)
	{
		B b = new B();
		b.i=10;
		b.j=40;
		b.sum();
		C c = new C();
		c.i=10;
		c.k=50;
		c.sum();
	}

}
