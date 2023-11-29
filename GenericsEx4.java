class MyData
{
    Integer i;
    public void set(Integer i1){
        i=i1;
    }
    public Integer get(){
        return i;
    }
}
public class GenericsEx4{
    public static void main(String[] args) {
	    MyData m1=new MyData();
	    Integer i1=3;
	    m1.set(i1);
	    System.out.println(m1.get());
	}
}