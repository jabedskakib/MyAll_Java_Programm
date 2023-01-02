
public class DiserianNum {

	public static void main(String[] args) {

		int n=153;
		int count=0;
		int sum=0;
		int x=n;
		while(n!=0)
		{
			int d=n%10;
			count++;
			n=n/10;

		}
		int pow=1;
		for(int i=count;i>=1;i++)
		{
			while(x!=0)
			{
				int d=x%10; 
				sum=sum+pow(d,i);  
				x=x/10;
			}

		}

		System.out.println(sum);

	}

	private static int pow(int d, int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
