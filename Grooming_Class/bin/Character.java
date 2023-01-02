
public class Character {

	public static void main(String[] args) {


		int n=5,sp=n/2,st=1;

		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=sp;k++)
			{
				System.out.print("  ");
			}
			int x=st/2+1;
			for(int j=1;j<=st;j++)
			{
				System.out.print((char)(x+64)+" ");

				if(j<=st/2)
				{
					x--;
				}else {
					x++;
				}
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
