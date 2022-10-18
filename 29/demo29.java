class ThreadOne extends Thread
{
	public void run() 
	{
		try
		{
			while( true )
			{
				System.out.println("Thread 1");
				sleep(2000);
			}
		} 
		catch (InterruptedException e)
		{
		}
	}
}
class ThreadTwo extends Thread
{
	public void run() 
	{
		try
		{
			while( true )
			{
				System.out.println("Thread 2");
				sleep(4000);
			}
		} 
		catch (InterruptedException e)
		{
		}
	}
}

public class demo29
{
	public static void main(String args[]) 
	{
		ThreadOne t1 = new ThreadOne();
		ThreadTwo t2 = new ThreadTwo();
		t1.start();
		t2.start();
	}

}
