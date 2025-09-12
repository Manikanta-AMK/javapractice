package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ShortestWordsFirst  {

	public static void main(String[] args) {
		
		String sentence = "java is a programing language";
		
		String[] splitwords = sentence.split(" ");		
		
		//by using the collections List interface
		List<String> list = Arrays.asList(splitwords);
		list.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
		
		// by using the for loop
	/*	for(int i=0;i<splitwords.length-1;i++)
		{
			for(int j=i+1;j<splitwords.length;j++)
			{
				if(splitwords[i].length()>splitwords[j].length())
				{
					String temp = splitwords[i];
					 splitwords[i] = splitwords[j];
					splitwords[j] = temp;
				}
			}
		} */
		
		for(String w: splitwords)
		{
			System.out.println(w);
		}
	}
}
