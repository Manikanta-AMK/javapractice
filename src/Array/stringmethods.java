package Array;

public class stringmethods {

	public static void main(String[] args) {

		String s = "Manikanta";
		String s2 = " is an ";
		String s3 = " automation tester";
		String s4 ="  AMK    ";
		String s5 = "Mani";
		
		System.out.println(s.contains(s5));
		System.out.println(s.length()+ s2.length()+s3.length());
		System.out.println(s+s2+s3);
		System.out.println(s4);
		System.out.println(s4.trim());
		System.out.println(s.charAt(3));
		
		if(s.contains(s5))
		{
			System.out.println("s contains s5 "+s.contains(s5));
		}
		
		String s6 = s.replace('a', 'o');
		System.out.println(s6);
		
		System.out.println(s.substring(4));
		System.out.println(s.substring(0,4));
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		String s7="manikantaarige219@gmail.com";
		String s8 = "mani kanta";
		String s9[] = s8.split(" ");
		String s10[] = s7.split("@");
		System.out.println(s10[0]);
		System.out.println(s10[1]);
		System.out.println(s10[0]);
		System.out.println(s9[0]);
		System.out.println(s9[1]);
		
		String s11="1,2,3,4,5,6,7,8,9,0";
		System.out.println(s11.replace(",",""));
		
	}

}
