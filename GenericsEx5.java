class MyData<E>
{
    E i;
    public void set(E i1){
        i=i1;
    }
    public E get(){
        return i;
    }
}
public class GenericsEx5{
    public static void main(String[] args) {
	    MyData<Integer>m1=new MyData<Integer>();
	    Integer i1=3;
	    m1.set(i1);
        System.out.println(m1.get());
        MyData<String>m2=new MyData<String>();
	    String s1="Hello";
	    m2.set(s1);
        System.out.println(m2.get());
	}
}