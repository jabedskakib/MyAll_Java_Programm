package Array;

public class OddEven {
	
	public int even(int[] x)
	{
		int even=0;
		for(int i=0;i<=x.length-1;i++)
		{
			if(x[i]%2==0)
			{
				even++;
			}
			
		}return even;
	}
	public int odd(int[] x)
	{
		int odd=0;
		for(int i=0;i<=x.length-1;i++)
		{
			if(x[i]%2==0)
			{
				
			}else {
				odd++;
			}
			
		}return odd;
	}
	
	public static void main(String[] args) {
		
		OddEven oe=new OddEven();
		int x[]= {50,62,47,89,45,62,85,46};
		
		System.out.println(oe.odd(x));
		System.out.println(oe.even(x));
	}

}
