package practice;

//public class reversestring {
//
//	public static void main(String[] args) {
//		
//		String name ="manikanta";
//		String reverse = "";
//		
//		for(int i = name.length() - 1; i >= 0; i--)
//		{
//			reverse += name.charAt(i);
//		
//		}
//		System.out.println(reverse);
//	}
//}

public class reversestring{

public static void main(String []args)
{
   String name = "Manikanta";
   String reverse = "";
   int len = name.length();

   for(int i=len-1;i>=0;i--)
    { 
	   reverse = reverse+name.charAt(i);
       
     }
   System.out.println(reverse);

   char arraystring[] = name.toCharArray();
   String reversname="";
   int length = arraystring.length;
   for(int a=length-1;a>=0;a--)
   {
	   reversname = reversname+arraystring[a];
   }System.out.println(reversname);
   
   String rev1="";
   
   for(int i=name.length()-1;i>=0;i--)
   {
	   rev1 = rev1+name.charAt(i);
   }System.out.println("rev1 is: "+rev1);
   
   
   
   
   
   
   
   
   
}
}
