class Year 
{
	int year;
	void set(int year)
 {
		this.year = year;
	}
}
class LeapYear extends Year
{
	void is_leap_year()
	{
		if(year%4==0) {
			System.out.println(year + " is leap year.");
		}
		else
 {
			System.out.println(year + " is not leap year.");
		}
	}
}
public class demo18 
{
	public static void main(String[] args)
	{
		LeapYear l = new LeapYear();
		l.set(2015);
		l.is_leap_year();
		l.set(2016);
		l.is_leap_year();
	}

}
