package practice;

public class findAllTypeOfChars {

	public static void main(String[] args) {
		
		String name = "ManiKanta_Arige@1234$";
		
		int specialchars=0;
		int smallchars=0;
		int captchars=0;
		int numbers=0;
		
		for(int i =0;i<name.length();i++)
		{
			char ch = name.charAt(i);
			
			if(ch>='a' && ch<='z')
			{
				smallchars++;
			}
			else if(ch>='A' && ch<='Z')
			{
				captchars++;
			}
			else if(ch>=1 && ch<=10)
			{
				numbers++;
			}
			else {
				specialchars++;
			}
		}
		System.out.println("Capital Letters: " + specialchars);
        System.out.println("Small Letters: " + smallchars);
        System.out.println("Digits: " + captchars);
        System.out.println("Special Characters: " + numbers);
	}
}
