package collections;

import java.util.ArrayList;

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
    }
}
