
public class Number {
	public static void main(String[] args) {
		
		int n=5;
		int t=n,x=n;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<n*2;j++)
			{
				//System.out.print(x+" ");
				if(j<=x)
				{
					System.out.print(j+" ");
				}else if(j>=t)
				{
					System.out.print((n*2)-j+" ");
				}else {
					System.out.print("  ");
					
				}
			}
			System.out.println();
			x--;
			t++;
		}
		
//		
//		
//		int n=3,sp=1;
//		for(int i=n;i>=1;i--)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(j+" ");
//				if(i==1)
//				{
//					System.out.print("  ");
//				}
//			}
//			for(int j=1;j<sp;j++)
//			{
//				System.out.print(" ");
//				
//			}
//			for(int j=i;j>=1;j--)
//			{
//				if(j==3) {
//					System.out.print("");
//				}else {
//					System.out.print(j+" ");
//				}
//		
//			}
//			
//			System.out.println();
//			
//			sp=sp+2;
//			
//		}
	
	
	
	}

}
