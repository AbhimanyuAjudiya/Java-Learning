
public class palindrome_6 
{
	public static void main(String[] args)
	 {
			int num = 898, rd = 0, remainder, od;
			od = num;
			while( num != 0 )
			{
				remainder = num % 10;
				rd = rd * 10 + remainder;
				num  /= 10;
			}
			if (od == rd)
				System.out.println(od + " is a palindrome.");
			else
				System.out.println(od + " is not a palindrome.");
		}
}
