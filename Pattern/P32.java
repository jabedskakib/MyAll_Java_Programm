package Pattern;

public class P32 {
/*	4321234
	 32123
	  212
	   1
	  212
	 32123
	4321234 
	*/
	public static void main(String[] args) {
		int n=7, sp=0,st=n;
		
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=sp;k++)
			{
				System.out.print("  ");
			}
			int x=st/2+1;
			for(int j=1;j<=st;j++) {
				
				System.out.print(x+" ");
				if(j<=st/2)
				{
					x--;
				}else {
					x++;
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

