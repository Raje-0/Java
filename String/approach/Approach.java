package approach;

import java.util.Arrays;

public class Approach {
public static void main(String[] args) {
	 String inputString = "scfdabcsfthjggh";

     // Convert the string to a character array
     char[] charArray = inputString.toCharArray();

     // Sort the character array
     Arrays.sort(charArray);

     // Convert the sorted character array back to a string
     String sortedString = new String(charArray);

     // Print the sorted string
     System.out.println("Sorted string: " + sortedString);
     
     String  s = "A man, a plan, a canal:Panama";
     String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
     System.out.println(cleanedString);
     
     int output ='b'-'a';
     System.out.println(output);
}
}
