package Strings;

public class substring {


		    public static void main(String[] args) {

		        String words = "aaabbc";

		        String s1 = words.substring(0, 3); // aaa
		        String s2 = words.substring(3, 5); // bb
		        String s3 = words.substring(5);    // c

		        System.out.println("Substring 1: " + s1);
		        System.out.println("Substring 2: " + s2);
		        System.out.println("Substring 3: " + s3);

		        System.out.println("the count of the a is: "+s1.length());
		        System.out.println("the count of the b is: "+s2.length());
		        System.out.println("the count of the c is: "+s3.length());
		        
		        //simple way
		        for(int i=0;i<words.length();i++)
		        {
		        	for(int j =i+1;j<=words.length();j++) 
		        	{
		        		System.out.println("the substring of the words are: "+words.substring(i, j));
		        	}
		        }
		        
		        
		}
}
