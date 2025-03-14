package Array;

public class countduplicates {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,10,50,60,70,10,80,90};
		int num=10;
		int count=0;
		System.out.println(a.length);
		for(int value:a)
		{
			if(value==num)
			{
				count++;
			
			}
		}
		System.out.println("the duplicates "+num+"'s are "+count);
	}
}
