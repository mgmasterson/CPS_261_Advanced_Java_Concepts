package Animationsimplethreads;

import java.util.Date;
/**
 * @author Michael Masterson
 * CPS 261
 * 
 * Simple Animations
 */
public class MyClass implements Runnable{

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
		MyClass mc = new MyClass();
		Thread t = new Thread(mc); // This constructor needs any class which implements Runnable
		t.start();

		System.out.println("Exitting main thread");

	}

}