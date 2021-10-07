package logicalPrograms;

public class PrimeNumberList {

	public void check()
	{
		
		System.out.println("The first hundred prime numbers are as follow :");
		
		for (int n=2; n<=100; n++) {
			
			int temp=0;
			
			for (int i=2; i<=n-1; i++){
				
				if (n%i==0)
				{
					temp=temp+1;
				}
			}
			
			if (temp==0)
			{
				System.out.print(n+" ");
			}
						
		}
	}
	
	public static void main(String[]args)
	{
		PrimeNumberList orv = new PrimeNumberList();
		orv.check();
		
	}
	
}
