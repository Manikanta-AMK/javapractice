package Array;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> cars= new ArrayList<>();
		cars.add("nissan");
		cars.add("suzuki");
		cars.add("benz");
		cars.add("audi");
		cars.add("honda");
		cars.add("hundai");
		cars.add("ford");
		cars.add("bmw");
		System.out.println("all car name "+cars);
		System.out.println("get the car number with index "+cars.get(1));
		System.out.println("get the car number with contains "+cars.contains("hon"));
//		System.out.println("get the car number with containsall "+cars.containsAll("h"));
		System.out.println("get the car number with index "+cars.indexOf(2));
		System.out.println("get the car number with index "+cars.lastIndexOf(cars));
		cars.set(5, "cheppanu brother");
		cars.remove(3);
		System.out.println("all car name "+cars);
		System.out.println("number of cars is  "+cars.size());
		
	}
}
