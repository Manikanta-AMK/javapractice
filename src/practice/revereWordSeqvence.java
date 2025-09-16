 package practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class revereWordSeqvence {

	public static void main(String[] args) {
		String name="welcome to java again";
		String[] words = name.split(" ");
		StringBuilder reversed = new StringBuilder();
		
		for(int i=words.length-1;i>=0;i--)
		{
			reversed.append(words[i]);
			if(i!=0)
			{
				reversed.append(" ");
			}
			
		}
		System.out.println(reversed.toString());
		
		String name2 = "Manikanta Arige";
		String[] names = name2.split(" ");
		String lastname="";
		String firstname="";
		
//		StringBuilder sb = new StringBuilder();
		
		for(String name3: names)
		{
			if(!name3.equals("Manikanta"))
			{
				lastname = name3;
			}
			else {
				firstname = name3;
			}
		}
		String reversename = lastname.concat(" "+ firstname);
		System.out.println("reversedname is: "+reversename);
		List<String> listname = Arrays.asList(name2);
		listname.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
		System.out.println("listname is: "+listname);
		
	}
}
