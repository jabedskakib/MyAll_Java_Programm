package Pattern;

public class P30 {
	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n||j==1||i==j)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		
	}

}
