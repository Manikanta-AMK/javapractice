package Strings.allStringPrograms;

public class numberConvertionsAndSumOfNumbers {

	public static void main(String[] args) {
		
		String[] arr = {"sfdf250", "ddsfge56", "fgdeg54"};
		int sum = 0;
		
		for(String str: arr)
		{
			StringBuilder sb = new StringBuilder();
			
			for(char ch: str.toCharArray())
			{
				if(Character.isDigit(ch))
				{
					sb.append(ch);
				}
			}
			
			if(sb.length()>0)
			{
				sum  += Integer.parseInt(sb.toString());
			}
		}
		
		System.out.println(sum);
		
	}
}
