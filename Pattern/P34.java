package Pattern;

public class P34 {
	public static void main(String[] args) {
		
		int n=5,sp=n/2,st=n;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<sp;j++)
			{
				System.out.print("  ");
			}
			int x=1;
			for(int j=1;j<=st;j++)
			{
				//System.out.print((char)(64+x)+" ");
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
				st=st+2;
				sp--;
			}
			System.out.println();
		}
		
		
		
	}

}
