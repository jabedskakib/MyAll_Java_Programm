class ShortArray {

	static boolean isPrime(int a) 
	{
		for(int j=2;j<a/2;j++)
		{
			if(a%j==0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int a[]= { 13,17,14,62,48,58,98,59,17 };

		int count= 0;

		for(int i=0;i<a.length;i++)
		{
			boolean x = isPrime(a[i]);
			if(x==true) {
				count++;
			}
		}
		System.out.println(count +" Prime number Present in an Array");
	}
}
