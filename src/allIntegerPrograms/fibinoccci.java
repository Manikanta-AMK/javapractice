package allIntegerPrograms;

public class fibinoccci {

	public static void main(String[] args) {
		
		int number = 5;
		int first = 0;
		int second = 1;
		int next;
		
		for(int i=1;i<=number;i++)
		{
			System.out.print(first+"");
			next  =first+second;
			first = second;
			second = next;
		}
	}
}
