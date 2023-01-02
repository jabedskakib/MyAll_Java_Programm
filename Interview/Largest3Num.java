package Interview;

public class Largest3Num {
	
	static int[] digitCount(int n)
	{
		int count=0;
		int x=n;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		int a[]=new int[count];
		for(int i=count-1;i>=0;i--)
		{
			a[i]=x%10;
			x=x/10;
		}
		return a;
	}
	public static void main(String[] args) {
		int n = 6478434;
		int big=0;
		int count=3;
		int sum =1;
		int rs[] = digitCount(n);
		
		for(int i=0;i<rs.length;i++)
		{
			sum = rs[i];
			for(int j=i+1;j<=i+2 && j<rs.length;j++)
			{
				sum =sum*10+rs[j];
			}
			if(sum>big)
			{
				big=sum;
			}
		}
		System.out.println(big);
	}

}
