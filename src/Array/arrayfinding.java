package Array;

public class arrayfinding {

	//linear search of arrays
	public static void main(String[] args) {
		
		int a[] = {10,20,30,50,70,80,40,100,50,100};
		int search_element = 80;
		boolean status= false;
		
		for(int i =0;i<a.length;i++)
		{
			System.out.println("element value is "+a[i]);
			if(a[i]==search_element)
			{
				System.out.println("element found ");
				status=true;
				break;
			}
		}
		 
		if(status==false)
		{
			System.out.println("element no found");
		}
		
	}

}
