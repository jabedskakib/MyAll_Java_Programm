package Pattern;

public class Pattern12 {
	public static void main(String[] args) {
		int n=7;
		int sp=1,st=n;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			int x=i;
			for(int j=1;j<=st;j++)
			{
				System.out.print(x+" ");
				
				if(j<=st/2)
				{
					x++;
				}else {
					x--;
				}
			
			}
			if(i<=n/2)
			{
				sp++;
				st=st-2;
			}else {
				sp--;
				st=st+2;
			}
			System.out.println();
		}
		
		
		
	}

}
