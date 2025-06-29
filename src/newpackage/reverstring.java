package newpackage;

import java.util.Iterator;

public class reverstring {
	
	public static void main(String[] args) {
		
		//method 1  string buffer class
		String name = "manikanta";
		String reverse = new StringBuilder(name).reverse().toString();
		System.out.println(reverse);
		
		//method 2  normal flow
		String reversed="";
		int len = name.length();
		for(int i=len-1;i>=0;i--)
		{
			reversed = reversed+name.charAt(i);
		}
		System.out.println(reversed);
		
		String name2 = "manikantaarige";
		String reversename = "";
		int length = name2.length();
		for(int j=length-1;j>=0;j--)
		{
			reversename = reversename+name2.charAt(j);
		}System.out.println(reversename);
		
		//method3  string to array

		
		char ch[] = name2.toCharArray();
		int leng = ch.length;
		for (int i = leng-1;i>=0;i--) {
			reversename=reversename+ch[i];
		}System.out.println(reversename);
	}

}
