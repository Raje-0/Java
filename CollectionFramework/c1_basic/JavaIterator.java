package c1_basic;
import java.util.*;

public class JavaIterator {
	 public static void main(String []args){
	        ArrayList mylist = new ArrayList();
	        mylist.add("Hello");
	        mylist.add("Java");
	        mylist.add("4");
	        Iterator it = mylist.iterator();
	        while(it.hasNext()){
	            Object element = it.next();
	            System.out.println((String)element);
	        }
	    }
	
}
