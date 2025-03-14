package wrapperclass;

public class dataconversionmethods {

		
	public static void main(String[] args) {
		
		/* String --> int
	    String --> double
	    String --> boolean
	    String --> char  not possible */
		
		String s = "11";
		String s2 = "12";

		String i = "10.5";
		String  j = "20.4";
		
		String m = "false";
		
		System.out.println(Integer.parseInt(s)+Integer.parseInt(s2));
		System.out.println(Double.parseDouble(i)+Double.parseDouble(j));
		System.out.println(Boolean.parseBoolean(m));
		
		
		// all premitive data type --> String (non-premitive data type)
		
		int a = 1;
		double d = 10.5;
		boolean b = true;
		char c = 'c';
		
		System.out.println(String.valueOf(b));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(a));
		
		
		
		
		
	}
}
