package string;

import java.util.Scanner;

public class S3_JavaSubstringComparisons {

	
		

		

		    public static String getSmallestAndLargest(String s, int k) {
		    	String first =s.substring(0, k);
		        String smallest = first;
		        String largest = first;
		        int length =s.length();
		       
		       for(int i=1;i<=length-k;i++){
		           first =s.substring(i,i+k);
		           if(first.compareTo(largest)>0)
		           largest=first;
		               
		          if(first.compareTo(smallest)<0)
		          smallest=first;
		       }
		        return smallest + "\n" + largest;
		    }


		    public static void main(String[] args) {
		    	System.out.println("enter your string");
		        Scanner scan = new Scanner(System.in);
		        String s = scan.next();
		        System.out.println("enter your integer");
		        int k = scan.nextInt();
		        scan.close();
		      
		        System.out.println(getSmallestAndLargest(s, k));
		    }
		
	}


