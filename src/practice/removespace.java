package practice;

public class removespace {

	public static void main(String[] args) {
		String name = "welcome to java";
		String name2 = name.replaceAll(" ", "");
		System.out.println(name2);
		String name3 = "again";
		String name4 = name2.concat(" "+name3);
		System.out.println(name4);
		String name5 = name4.replaceAll(" ", "");
		System.out.println(name5);
		
		Boolean value = name5.contains(name3);
		System.out.println(value);
	}
}
