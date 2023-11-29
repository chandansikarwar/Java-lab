public class GenericsEx3
{
    public <E> void Search(E s[],E key){
        for(int i=0;i<s.length;i++){
            if(key==s[i]){
                System.out.println(key +" found at "+i+" index");
            }
        }
    }
	public static void main(String[] args) {
	    GenericsEx3 g=new GenericsEx3();
	    String s[]=new String[]{"Hello","World"};
	    g.<String>Search(s,"World");
	    Integer i[]={1,2,3,4};
	    g.<Integer>Search(i,3);
	}
}