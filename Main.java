public class Main extends Thread
 {
	public static void main(String[] args) {
		Main t1 = new Main();
		t1.start();
		System.out.println("this code is outside of the thread:");
	}
	public void run(){
	    System.out.println("this code is running in a thread :");
	}
}