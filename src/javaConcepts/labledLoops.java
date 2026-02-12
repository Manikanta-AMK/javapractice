package javaConcepts;

public class labledLoops {

	public static void main(String[] args) {
		
		// without label
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;i<=4;j++)
			{
				if(j==2)
				{
					break;
				}
				System.out.println("i="+i+" "+"j="+j);
			}
		}
		
		//with label and break keyword
		
		outer:
			for(int i=1;i<=4;i++)
			{
				for(int j=1;i<=4;j++)
				{
					if(j==2)
					{ 
						break outer;
					}
					System.out.println("outer label with break keyword "+"i="+i+" "+"j="+j);
				}
			}		
		
		
		// with continue keyword
		outer:
			for(int i=1;i<=4;i++)
			{
				for(int j=1;i<=4;j++)
				{
					if(j==2)
					{
						continue outer;
					}
					System.out.println("outer label with continue keyword  "+"i="+i+" "+"j="+j);
				}
			}		

		
		
	}
}
