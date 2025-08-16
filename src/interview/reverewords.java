package interview;

public class reverewords {

	public static void main(String[] args) {
		
		String name = "manikanta is an automation tester";
		String[] reverse = name.split(" ");
		for(int i= reverse.length-1;i>= 0;i--)
		{
			System.out.print(reverse[i]+" ");
		}
		System.out.println(" ");
		StringBuilder sb = new StringBuilder(name);
		StringBuilder reverse2 = sb.reverse();
		System.out.println(reverse2);
	}
}
