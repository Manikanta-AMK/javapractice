package collections.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mappingConcepts {

	public static void main(String[] args) {
		
		//creation of map
		Map<Integer, String> map = new HashMap<>();  // HashMap or HashTable or TreeMap Any class we can use to create and implement the Map
		map.put(1, "Manikanta");
		map.put(2, "Arige");
		map.put(3,"Amk");
		System.out.println(map);
		
		//retrieve  the all keys 
		Set<Integer> keys = map.keySet();
		for(Integer key:keys)
		{
			System.out.println(key);
		}
		
		//retrieve the key by index
		System.out.println(map.get(1));
		
		//retrieve  all values
		System.out.println(map.values());
		
		//retrieve all values
		Collection<String> Values =  map.values();
		for(String value: Values)
		{
			System.out.println(value);
		}
		
		//verify the hash table or hash map or tree map data
		System.out.println(map.isEmpty());
		
		//verify value and key exist
		System.out.println(map.containsKey(10));
		System.out.println(map.containsValue("manikanta"));
		
		//insert new data if not available
		map.putIfAbsent(4, "AMK");
		
		//remove  the key
		map.remove(3);
		
		//remove the value
		map.remove(1, "Manikanta");
		
		map.put(2, "Arige Manikanta");
		System.out.println(map);
		
		// set view for mapped data
		Set<Entry<Integer,String>> entries = map.entrySet();
		for(Entry<Integer,String> entry: entries)
		{
			Integer Key = entry.getKey();
			String Value = entry.getValue();
			System.out.println(Key+" >>>> "+Value);
		}
	}
}
