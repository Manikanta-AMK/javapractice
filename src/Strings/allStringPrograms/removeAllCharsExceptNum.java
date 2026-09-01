package Strings.allStringPrograms;

public class removeAllCharsExceptNum {

	public static void main(String[] args) {
		
		String[] arr = {"gvjhbb132", "hbjkl52"};

		int sum = 0;
		
		for(String s : arr)
		{
			String num = s.replaceAll("[^0-9]", "");
			
			if(!num.isEmpty())
			{
				sum += Integer.parseInt(num);
			}
			
			//removing digits from string
			String text = s.replaceAll("[0-9]","");
			System.out.println(text);
		}
		System.out.println(sum);
		
		
	}
}
