package Strings.allStringPrograms;

public class RemoveAllWhitespaces {

	public static void main(String[] args) {
		
		String name = "Manikanta Arige";
		String replace = "";
		if(name.contains(" "))
		{
			replace = name.replace(" ","");
		}
		System.out.println(replace);
				
	}
}
