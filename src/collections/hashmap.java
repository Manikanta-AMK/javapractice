package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class hashmap {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		HashMap<String, List<String>> map2 = new HashMap<>();
		map.put("name", "manikanta");
		map.put("name","arige");
		map.put("name", "amk");
		map.put("name","AMK");
		System.out.println(map);
		map2.putIfAbsent("name", new ArrayList<>());
		map2.get("name").add("manikanta"); 
		map2.get("name").add("amk");
		map2.get("name").add("AMK");
		map2.get("name").add("arige");
		System.out.println(map2);
	}
}
