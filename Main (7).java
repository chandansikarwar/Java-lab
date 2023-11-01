public class Main implements Runnable
{
	
	public void run(){
	    try{
	        Thread.sleep(1000);
	    }catch(Exception e){
	        System.out.println("Exception" + e);
	    }
	     System.out.println("run method");
	}
	public static void main(String[] args) {
	for(int i=0;i<10;i++){
	    Thread t1 = new Thread (new Main());
	    t1.start();
	}
}
}
