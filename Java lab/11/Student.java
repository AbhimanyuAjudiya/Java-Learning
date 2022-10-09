
public class Student
{
	private int roll;  
	private String name;  
	private double per;
	Student() 
{
		roll = 0;
		name = "Unknown";
		per = 0.0;
	}
	Student(int roll, String name, double per) 
{
		this.roll = roll;
		this.name = name;
		this.per = per;
	}  
	Student( Student s ) 
{
		this.roll = s.roll;
		this.name = s.name;
		this.per = s.per;
	}  
	void show_data()
{
		System.out.println("Roll: " + this.roll);
		System.out.println("Name: " + this.name);
		System.out.println("Per: " + this.per);
	}  
}  
class demo11
{  
	public static void main(String args[])
{  
		Student s1 = new Student();  
		Student s2 = new Student(10, "yash", 99.6);  
		Student s3 = new Student(s2);  
		s1.show_data();
		s2.show_data();
		s3.show_data();
	}

}
