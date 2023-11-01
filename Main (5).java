
public class Main implements Runnable
{
	public static void main(String[] args) {
		Main t1 = new Main();
			Thread ta = new Thread(t1);
		ta.start();
		Main t2 = new Main();
			Thread tb = new Thread(t2);
		tb.start();
	}
	public void run(){
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   for(int i=1;i<=10;i++){
	        System.out.println(n +"*" +i+"="+ i*n);
	   }
	}
}