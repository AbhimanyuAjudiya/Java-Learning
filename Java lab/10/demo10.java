class Student
 {  
	private int roll;  
	private String name;  
	private double per;
	void set_data(int roll, String name, double per) 
{
		this.roll = roll;
		this.name = name;
		this.per = per;
	}  
	void show_data()
{
		System.out.println("Roll: " + this.roll);
		System.out.println("Name: " + this.name);
		System.out.println("Per: " + this.per);
	}  
}  
class demo10
{  
	public static void main(String args[])
{  
		Student s1=new Student();  
		s1.set_data(10, "yash", 95.09);
		s1.show_data();
	}
}  
