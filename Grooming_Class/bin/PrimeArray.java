
public class PrimeArray {

	private static int[] isPrime(int[] x) {
		
		int rs[]=new int[x.length];
		int n=0;
		for(int i=0;i<x.length;i++)
		{
			n=x[i];
			for(int j=2;j<=n/2;j++)
			{
				if(n%j==0)
				{
					//System.out.println();
				}else {
					rs[i]=n;
				}
			}
		}

		return rs;
	}


	public static void main(String[] args) {

		int x[]= {5,17,13,6,3,23,2};

		int rs[]=isPrime(x);
		
		for(int i=0;i<rs.length;i++)
		{
			if(rs[i]!=0)
			{
				System.out.println(rs[i]);
			}
		}
		
	}


}
