package Pattern;

public class P29 {
	public static void main(String[] args) {
		int n=7,sp=n/2,st=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=sp;k++)
			{
				System.out.print("  ");
			}
			int x=1;
			for(int j=1;j<=st;j++) 
			{
				System.out.print("* ");
				
			}
				if(i<=n/2) 
				{
					sp--;
					st=st+2;
				}else {
					sp++;
					st=st-2;
				}
			
				System.out.println();
		}
		
	}

}
