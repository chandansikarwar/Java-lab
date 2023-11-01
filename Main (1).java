public class Main implements Runnable
{
	public static void main(String[] args) {
		Main t1 = new Main();
		Thread t = new Thread(t1);
		t.start();
		System.out.println("this code is outside of the thread:");
	}
	public void run(){
	    System.out.println("this code is running in a thread :");
	}
}