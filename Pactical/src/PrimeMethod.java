import java.util.Scanner;

public class PrimeMethod {
	 static boolean isPrime(int n) {
			
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0) 
				{
					return false;
				}else {
					return true;
				}
			}
			return true;
		}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number - ");
		int n = sc.nextInt();
		
		boolean x=isPrime(n);
		if(x==true)
		{
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
	}
}
