package StringProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class printLengthBy {

	public static void main(String[] args) {
		
		String name = "Manikanta Arige a andbcd akdld asdsdls";
		String[] splitname = name.split(" ");
		
		List<String>list =  Arrays.asList(splitname);
		list.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
		
		System.out.println(list);		
		
		Integer[] number = {12,2,45,6,4,8945,22456};
		
		List<Integer> num = Arrays.asList(number);
		num.sort(Comparator.naturalOrder());
		System.out.println(num);
	}
}
