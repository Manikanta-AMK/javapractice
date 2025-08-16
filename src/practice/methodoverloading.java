package practice;

public class methodoverloading {

	public static void main(String[] args) {
		methodoverloading mo = new methodoverloading();
		
		System.out.println(mo.add(10, 20)+mo.add(10, 20,30));
	}

	int add(int a, int b)
	{
	    return a+b;
	}

	int add(int a, int b, int c)
	{
	    return a+b+c;
	}
	
}
