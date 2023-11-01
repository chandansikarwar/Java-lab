public class Main extends Thread
{
    Main(String s){
        super(s);
        System.out.println("new thread created"+ this);
        start();
    }
	
	public void run(){
	    try{
	    for(int i=0;i<10;i++){
	    System.out.println("new thread created"+ this);
	    Thread.sleep(1500);
	}
}
catch(Exception e){
    System.out.println("currently execute thread is interrupted");
}
System.out.println("currently execute threas run is termunated:");
}
public static void main(String[] args) {
    Main t = new Main("t");
}
    
}