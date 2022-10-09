
public class conditional_operator_3 
{
	public static void main(String args[])
	{	
		int a = 4, b = 7, c = 2, d;
        		d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
       		 System.out.println("Largest Number:" + d );
	}


}
