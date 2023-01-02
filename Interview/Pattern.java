package Interviwe;

public class Pattern {
	public static void main(String[] args) {
		
		int n=3;int x=n,t=n;
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=n*2-1;j++)
			{
				if(j <= x)
				{
					System.out.print(j);
				}else if(j>=t)
				{
					System.out.print(n*2-j);
				}else
				{
					System.out.print(" ");
				}
			}
			x--;t++;
			System.out.println();
		}
		
		
	}

}
