package ThreadsFundamentals;
import java.util.Date;
/**
 * @author Michael Masterson
 * CPS 261
 * 
 * Getting to know how to use Threads Data and Sync
 */

public class MyThread1 extends Thread{

	public void run()
	{
		while (true)
		{
			try
			{
				Thread.sleep(1000); // Sleep for 1 second
				Date d = new Date();
				System.out.println("Date =" + d);
			}
			catch (InterruptedException e)
			{            
			}
		}
	}
	public static void main(String[] args) {
		MyThread1 mt = new MyThread1();
		mt.start();
		System.out.println("Exitting main thread");

	}

}