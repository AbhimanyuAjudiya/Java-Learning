
public class Reverse_5 
{
	public static void main(String args[])
	{
		int no= 345;
      		int rno = 0;
     	while( no != 0 )
      	{
         	rno = rno * 10;
          	rno = rno + no%10;
          	no = no/10;
     	}
     		 System.out.println("Reverse of input number is: " + rno); 
	}
}
