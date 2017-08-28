package ThreadDataandSynchronizationIssues;
/**
 * @author Michael Masterson
 * CPS 261
 * 
 * Getting to know how to use Threads Data and Sync
 */
public class DeadlockDemo implements Runnable{

	Deadlock deadlock1 = new Deadlock();
	Deadlock deadlock2 = new Deadlock();

	public void run()
	{
		System.out.println("Starting Thread");
		deadlock2.printOther(deadlock1);
		System.out.println("Thread exiting");
	}


	public static void main(String[] args) {
		DeadlockDemo dd = new DeadlockDemo();

		Thread t = new Thread(dd);
		t.start();

		dd.deadlock1.printOther(dd.deadlock2);
		System.out.println("Exiting main");
	}

}
