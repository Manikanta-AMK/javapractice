package Array;

import java.util.Iterator;

 /* declare an array
  add value in to an array 
 find length of an array 
 get single value from array 
 get multiple an array */
 
public class array {

	public static void main(String[] args) {
		
		// single dimentional array 
		//type1 declareation
		int a[] = new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		System.out.println("second value is ="+a[1]);
		
      // type declaration		
		int b[] = {100,200,300,400,500};
		
		System.out.println("array length is "+b.length);
		
	    for(int i=0;i<b.length;i++)
	    {
	    	System.out.println("value "+b[i]+" position at "+i);
	    }
		
	    
	    // multi dimentional array
	    //type1 declaration
	    
	    int c[][] =  new int [3][3];
	    c[0][0] = 100;
	    c[0][1]= 200;
	    c[0][2] = 300;
	    
	    c[1][0]	 = 400;
	    c[1][1] = 500;
	    c[1][2] = 600;
	    
	    c[2][0]	 = 700;
	    c[2][1] = 800;
	    c[2][2] = 900;
	    
	    System.out.println("c element length is "+c.length);
	    
	    //type2 
	    
	    int d[][] = { {100,200,300},{400,500,600},{700,800,900} };
	    
	    System.out.println("d length is "+d.length);
	    
    	System.out.println(" ");
	    
    	//normal for loop
	    for(int row=0;row<d.length;row++)
	    {
	    	for(int column=0;column<d[row].length;column++ )
	    	{
	    		System.out.print(d[row][column]+" ");
	    	}
	  //  	System.out.println("row "+row+" is completed");
	    	System.out.println();
	    }
	    System.out.println(" ");
	    
	    //enhanced loop
	    for(int arr[]:d)
	    {
	    	for(int x:arr)
	    	{
	    		System.out.print(x+" ");
	    		
	    	}System.out.println();
	    }
	    
	}
}
