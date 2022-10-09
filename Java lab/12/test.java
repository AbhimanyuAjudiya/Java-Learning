
public class test 
{
	static int count=0;
	test()
 {
		count++;
	}
}
class yash
{
	public static void main(String[] args)
	{
		test t1 = new test();
		System.out.println(test.count);
		test t2 = new test();
		test t3 = new test();
		System.out.println(test.count);
	}

}
