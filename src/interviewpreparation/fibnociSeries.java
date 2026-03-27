package interviewpreparation;

public class fibnociSeries {

	public static void main(String[] args) {
		
		int num = 6;
		int first=1;
		int second=0;
		int next;
		
		for(int i=1;i<=num;i++)
		{
			System.out.print(first+"");
			next = first+second;
			first=second;
			second = next;
		}
		
		
		
	}
}
