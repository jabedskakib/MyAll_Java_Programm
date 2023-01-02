
public class PalindromArray {
	static boolean isPalindrom(int x)
	{
		int sum=0,n=x;
		
			while(n!=0)
			{
				int d=n%10;
				sum=sum*10+d;
				n=n/10;
			}
			
			if(x==sum)
			{
				return true;
			}else {
				return false;
			}
	}

	public static void main(String[] args) {

		int x[]= {654,852,963,659,454,656,898};
		int y[]=new int[x.length];
		int count=0;
		//System.out.println(rs);

		for(int i=0;i<x.length;i++)
		{
			boolean rs=isPalindrom(x[i]);

			if(rs==true)
			{
				y[count++]=x[i];
			}
		}
		for(int i=0;i<y.length;i++)
		{
			if(y[i]!=0)
			{
				System.out.println(y[i]);
			}
		}

	}

}

