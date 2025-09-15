package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class arrayList 
{
    public static void main(String[] args) 
    {
    	ArrayList<String> arraylist = new ArrayList<>();
    	arraylist.add("manikanta");
    	System.out.println(arraylist);
    	arraylist.clear();
    	System.out.println(arraylist);
    	arraylist.add(0, "manikanta");
    	System.out.println(arraylist);
    	ArrayList<String> extra = new ArrayList<>();
    	extra.add("name");
    	extra.add("name2");
    	arraylist.addAll(1,extra);
    	System.out.println(arraylist);
    	Object n = arraylist.clone();
    	System.out.println(n);
    	boolean obj = arraylist.containsAll(extra);
    	System.out.println(obj);
    	
    	Integer[] num = new Integer[] {1,5,3,4,6,7,8,9};
    	ArrayList<Integer> array = new ArrayList<>(Arrays.asList(num));
    	array.add(10);
    	System.out.println(array);
    	System.out.println(array.get(3));
    	System.out.println(array.contains(7));
    	System.out.println(array.containsAll(Collections.emptyList()));
    	
    	//get all elements by using get method within for loop
    	for(int i=0;i<array.size();i++)
    	{
    		System.out.println(array.get(i));
    	}
    	
    	//get all elements by using reference variable within for each loop
    	for(Integer num2 : array)
    	{
    		System.out.println(num2);
    	}
    	
    	   //Synchronization using explicitly
        Collections.synchronizedList(array);
    }
}
