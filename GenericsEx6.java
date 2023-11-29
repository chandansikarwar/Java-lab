class MyData<E>
{
    public <E> void Search(E s[],E key){
        for(int i=0;i<s.length;i++){
            if(key==s[i]){
                System.out.println(key +" found at "+i+" index");
            }
        }
}
}
public class GenericsEx6{
    public static void main(String[] args) {
	    MyData<Integer>m1=new MyData<Integer>();
	    Integer i1[]={1,2,3,4};
	    m1.<Integer>Search(i1,3);
        MyData<String>m2=new MyData<String>();
	    String s1[]=new String[]{"Hello","World"};
	    m2.<String>Search(s1,"World");
	}
}