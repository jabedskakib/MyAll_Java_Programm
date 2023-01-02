package Pattern;

public class P31 {
	public static void main(String[] args) {
		int n=4;
		int sp=n/2;
		int sn=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++) 
			{
				System.out.print("  ");
			}
				
			int x=1;
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(x+" ");
				if(j<i) {
					x++;
				}else {
					x--;
				}
			}	
			
			
			System.out.println();
		}
		
	}
}
