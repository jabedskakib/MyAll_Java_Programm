package Pattern;

public class MavenP {
	public static void main(String[] args) {
		int n=5;
		int x=1;
		for(int i=1;i<=n;i++)
		{
			int sum=0;
			for(int j=1;j<=i;j++)
			{
				sum=sum+x;
				System.out.print(x+++" ");
			}
			System.out.print(sum);
			System.out.println();
		}
	}
}
