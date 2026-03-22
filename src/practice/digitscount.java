package practice;

public class digitscount {

	public static void main(String[] args) {
		
		int num = 123456987;
		int count = 0;
		int num2 = 5682;
		while(num>0)
		{
			num = num/10;
			count++;
		}
		System.out.println(count);
	
		if(num%2==0)
		{
			System.out.println("number is even");
		}else {
			System.out.println("number is odd");
		}
		
		System.out.println("sum of the : "+Integer.sum(num, num2));
		
	}
}
