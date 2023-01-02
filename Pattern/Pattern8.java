package Pattern;

public class Pattern8 {

	public static void main(String[] args) {
		int n = 5;
		int x = 64;

		for(int i=1;i<=n;i++) {
			for(int j=n;j>n-i;j--)
			{
				System.out.print((char)(x+j));
			}
		System.out.println();
		}
	}
}
