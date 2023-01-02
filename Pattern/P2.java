package Pattern;

public class P2 {

	public static void main(String[] args) {
		int n=5;
		int z=5;

		for (int i=1;i<=n;i++) {
			for(int j=z;j<=n-z;) {
				System.out.print(" ");
				z--;
			}
			for(int j=i;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
}
