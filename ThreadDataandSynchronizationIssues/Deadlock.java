package ThreadDataandSynchronizationIssues;

import java.util.ArrayList;
/**
 * @author Michael Masterson
 * CPS 261
 * 
 * Getting to know how to use Threads Data and Sync
 */
public class Deadlock {
	ArrayList<String> arr = new ArrayList<String>();
	Deadlock()
	{
		arr.add("red");
		arr.add("orange");
		arr.add("green");
		arr.add("black");
		arr.add("brown");
		arr.add("white");
		arr.add("magenta");
		arr.add("yellow");
	}

	synchronized int getSize()
	{
		return arr.size();
	}
	synchronized String get(int i)
	{
		try
		{
			Thread.sleep(10);
		}
		catch (InterruptedException e){}

		return arr.get(i);
	}
	void printOther(Deadlock d)
	{
		int len = d.getSize();
		for (int i=0; i < len; i++)
		{
			System.out.println(d.get(i));
		}
	}

}

