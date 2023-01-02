package Pattern;

class Pattern6
{
	public static void main(String[] args) {
		int n = 5;
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=n-i;j++)
			{
				System.out.println((char)64+j);
			}
		}
	}
}