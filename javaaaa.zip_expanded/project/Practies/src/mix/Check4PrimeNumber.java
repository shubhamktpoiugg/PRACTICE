package mix;

public class Check4PrimeNumber {

	public static void main(String[] args) {
		
		int number=4,flag=0;
		for(int i=2; i<=number-1; i++)
		{
			if (number%i==0)
			{
			flag=1;	
			}
			
		}
		if(flag==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}