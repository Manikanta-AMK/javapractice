package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class setInterfaceWithString {

	public static void main(String[] args) {
		
		TreeSet<String> hs = new TreeSet<>();
		hs.add("Manikanta");
		hs.add("amk");
		hs.add("arige");
		hs.add("AMK");
		
		System.out.println(hs);
		System.out.println(hs.hashCode());
		System.out.println(hs.first());
		
		List<String> names = new ArrayList<>(Arrays.asList("Manikanta","AMK1","amk","abcd"));
		Collections.sort(names, String.CASE_INSENSITIVE_ORDER);
		System.out.println(names);
	}
}
