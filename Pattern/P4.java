package Pattern;

public class P4 {
	public static void main(String[] args) {
		int n= 5;
		
		for(int i=1;i<=n;i++) {
			for(int z=n-i;z>=1;z--) {
				System.out.print(" ");
			}			
			for(int j=i;j>=1;j--){
				{
					System.out.print(j);
				}
			
			}System.out.println();
			
		}
		
	}

}
