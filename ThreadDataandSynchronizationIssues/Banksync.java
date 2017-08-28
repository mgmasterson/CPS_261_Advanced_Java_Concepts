package ThreadDataandSynchronizationIssues;

/**
 * @author Michael Masterson
 * CPS 261
 * 
 * Getting to know how to use Threads Data and Sync
 */
class Banksync implements Runnable
{
	int savings[] = {100, 200, 300, 400, 500};
	int checking[] = {100, 200, 300, 400, 500};

	synchronized void chk2save(int index, int amount)
	{
		System.out.println("-----Starting chk2save: " +index + "," +amount);
		if (index >= 0 && index < savings.length)
		{
			if (amount <= checking[index])
			{
				// Begin Vulnerable region  
				savings[index] += amount;
				// The following sleep, makes our 
				// vulnerable window huge
				try
				{
					Thread.sleep(6000);
				}
				catch (InterruptedException e){}

				checking[index] -= amount;
				// End Vulnerable region
			} 
		}
		System.out.println("-----Ending chk2save");
	}


	synchronized void printTotals()
	{
		int totalSavings=0, totalChecking=0;

		System.out.println(); // blank line
		System.out.println("*********************************");
		for (int i=0; i < savings.length; i++)
			totalSavings += savings[i];
		System.out.println("Total Savings = " + totalSavings);

		for (int i=0; i < checking.length; i++)
			totalChecking += checking[i];
		System.out.println("Total Checking = " + totalChecking);
		System.out.println("*******Grand Total = " + 
				(totalSavings + totalChecking));
		System.out.println(); // blank line

	}

	public void run() 
	{
		boolean continueFlag=true;
		while (continueFlag)
		{
			printTotals();
			try
			{
				Thread.sleep(5000);
			}
			catch (InterruptedException e)
			{
				System.out.println("auditor is exitting");
				continueFlag = false;
			}
		}
	}
	void delay(int num_seconds)
	{
		try { 
			Thread.sleep(1000 * num_seconds);
		}
		catch (InterruptedException e){}
	}
	public static void main(String[] args)
	{
		String str="";
		Bank ba = new Bank();

		Thread audit = new Thread(ba);
		audit.start();

		ba.delay(6);      // delay for 6 seconds
		ba.chk2save(2, 40);

		ba.delay(6);      // delay for 6 seconds
		ba.chk2save(3, 50);

		ba.delay(25);     //delay for 25 seconds   

		audit.interrupt();
		System.out.println("BYE");
	}
}
