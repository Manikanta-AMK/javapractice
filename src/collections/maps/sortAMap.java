package collections.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class sortAMap {

	public static void main(String[] args) {
		
		
		Map<String, Integer> map = new HashMap<String,Integer>();
		map.put("Manikanta", 01);
		map.put("Amulya", 02);
		map.put("VasuDev", 03);
		
		//step1 covert to list
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		
		//step 2 sort by value
		list.sort(Map.Entry.comparingByValue());
		
		//step3 Store in LinkedHashMap to maintain order
	    Map<String,Integer> sortedMap = new LinkedHashMap<>();
		
		for(Map.Entry<String, Integer> entry: list)
		{
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		System.out.println("sorted map is : "+sortedMap);
	
	}
}
