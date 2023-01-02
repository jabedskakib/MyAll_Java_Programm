
public class Prime {
	
	static boolean isPrime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int a[]= {1,12,33,13,19,8,256,111,11,59,7};
		
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			boolean rs=isPrime(a[i]);
			
			if(rs)
			{
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
