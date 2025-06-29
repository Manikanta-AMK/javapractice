package practice;

//public class swaping {
//
//	public static void main(String args [])
//	{
//		int i = 1;
//		int j = 2;
//		
//		System.out.println("before swaping ");
//		
//		int a = i;
//		i=j;
//		j=a;
//		
//		System.out.println("i"+ i);
//		System.out.println("j"+j);
//	
//		
//		
////	int 	c=c+d;
//		
//		
//		
//	}
//}

public class swap {
	public static void main(String[] args) {
		int temp;
		int a = 10;
		int b = 20;
		System.out.println("before swapping " + a + "&" + b);

		temp = a;
		a = b;
		b = temp;
		System.out.println("after swapping " + a + "&" + b);

		int i = 10;
		int j = 20;

		System.out.println("before  swapping " + i + "&" + j);
		i = i + j;
		j = i - j;
		i = i - j;
		System.out.println("after swapping " + i + "&" + j);
		
		int g = 20;
		int h =10;
		
		g=g-h;
		h=g+h;
		System.out.println(g);
		System.out.println(h);
		
		
		int f=10;
		int k=20;
		System.out.println("before swapping"+f);
		System.out.println("before swapping"+k);
		
		k=f+k;
		f=k-f;
		k=k-f;
		
		System.out.println("after swapping  f"+f);
		System.out.println("after swapping k"+k);
		

	}
}
