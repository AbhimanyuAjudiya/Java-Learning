
public class secondmaximum_usingarrays_4
{
	public static void main(String args[])
	{
		int a = 10, b = 20, c = 30;
		int second_max;
		if ( a < b ) 
		{
			if ( b < c ) second_max = b;
			else second_max = ( a < c ? c : a );
		}
		else
		{
			if ( a < c ) second_max = a;
			else second_max = ( b < c ? c : b );
		}
		System.out.println( "Second maximum value is: " + second_max );
	}
}
