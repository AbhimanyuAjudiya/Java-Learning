class A
{
	int i;
}
class B extends A
{
	int j;
}
class C extends B
{
	int k;
	void sum()
	{
		System.out.println("i+j+k : " + (i+j+k));
	}
}
public class demonstrate16
{
	public static void main(String[] args)
	{
		C c = new C();
		c.i=10;
		c.j=80;
		c.k=90;
		c.sum();
	}
}
