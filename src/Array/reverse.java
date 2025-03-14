package Array;

public class reverse {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,60,70,80,90};
	
		System.out.println(a);
		
		for(int i=a.length-1;i>=0;i--)
		{
			
			System.out.println(a[i]);
		}
		
		String s[] = {"Manikanta Arige"};
		String name=  "Manikanta Arige";
		int reverse = name.length();
		System.out.println(name.length());
		
		for(int i=0;i<name.length()-1;i++)
		{
			System.out.println(reverse);
		}
		
		
	}
}
