
public class Main implements Runnable
{
	public static void main(String[] args) {
		Main t1 = new Main();
			Thread ta = new Thread(t1);
		ta.start();
		Main t2 = new Main();
			Thread tb = new Thread(t2);
		tb.start();
		Main t3 = new Main();
			Thread tc = new Thread(t3);
		tc.start();
		System.out.println("this code is outside of the thread:");
	}
	public void run(){
	    System.out.println("this code is running in a thread :");
	}
}