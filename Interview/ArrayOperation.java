package Interview;
public class ArrayOperation {
	
	// Biggest Number in Array
	
	static int isBiggest(int ar[])
	{
		int big = ar[0];
		
		for(int i=1;i<ar.length;i++)
		{
			if(big<ar[i])
			{
				big=ar[i];
			}
		}
		
		return big; 
	}
	
	
	// Smallest Number in Array
	
	static int isSmallest(int ar[])
	{
		int small = ar[0];
		
		for(int i=1;i<ar.length;i++)
		{
			if(small>ar[i])
			{
				small=ar[i];
			}
		}
		
		return small; 
	}
	
	
	// Odd-Even Number in Array
	
	static int[] isOddEven(int ar[])
	{
		int oc=0,ec=0;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0) {
				ec++;
			}else {
				oc++;
			}
		}
		
		int count[]= {oc,ec};
		
		return count;
	}
	
	
	
	
	// Prime Number in Array
	
	static boolean isPrime(int ar)
	{
		for(int i=2;i<=ar/2;i++)
		{
			if(ar%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	
	
	// Reverse Number in Array
	
	static int[] isReverse(int ar[])
	{
		int rs[]= new int[ar.length];
		int j=0;
		for(int i=ar.length-1;i>=0;i--)
		{
			rs[j]=ar[i];
			j++;
		}
		
		return rs;
	}
	
	
	// Sum of Array 
	
	static int isSumOfArray(int ar[])
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum = sum+ar[i];
		}
		
		return sum;
	}
	
	// Marge 2 Array
	
	static int[] isMarge (int ar[],int rev[])
	{
		int marge[]=new int[ar.length+rev.length];
		
		for(int i=0;i<ar.length;i++)
		{
			marge[i]=ar[i];
		}
		
		for(int i=0;i<ar.length;i++)
		{
			marge[ar.length+i]=rev[i];
		}
		return marge;
	}
	
	// Marge 2 Array in Zic Zac 
	
	static int[] isZicZac(int ar[],int rev[])
	{
		int ziczac[] =new int[ar.length+rev.length];
		
		for(int i=0;i<ziczac.length;i++)
		{
			for(int j=i+1;j>=i+1;)
			{
				ziczac[i]=ar[i];
				ziczac[j]=rev[i];
			}
		}
		
		
		return ziczac;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		int ar[] = {13,10,17,18,39,15,24,15,26,20};
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		
		// Biggest Number in Array
		
		int big=isBiggest(ar);
		System.out.println("Biggest Number - "+big);
		

		// Smallest Number in Array
		
		int small=isSmallest(ar);
		System.out.println("Smallest Number - "+small);
		
		// Odd-Even Number in Array
		
		int count[]=isOddEven(ar); 
		System.out.println("Odd Number - "+count[0]);
		System.out.println("Events Number - "+count[1]);
		
		
		// Prime Number in Array
		int rs=0;
		for(int i=0;i<ar.length;i++)
		{
			boolean prime =isPrime(i); 
			
			if(prime)
			{
				rs++;
			}
		}
		
		System.out.println(rs+" Prime Number.");
		
		
		// Reverse Number in Array
		System.out.println("Reverse Number in Array");
		int rev[]=isReverse(ar);
		
		for(int i=0;i<rev.length;i++)
		{
			System.out.print(rev[i]+" ");
		}
		System.out.println();
		
		// Sum of Array 
		
		int sum = isSumOfArray(ar);
		
		System.out.println("Sum of Array is - "+sum);
		
		
		// Marge 2 Array
		int marge[]=isMarge(ar, rev);
		
		System.out.println("Marge 2 Array - ");
		for(int i=0;i<marge.length;i++)
		{
			System.out.print(marge[i]+" ");
		}
		
		System.out.println();
		
		// Marge 2 Array in Ziczac way
		
		int ziczac[] = isZicZac(ar, rev) ;
		
		System.out.println("Marge 2 Array in Ziczac way");
		
		for(int i=0;i<ziczac.length;i++)
		{
			System.out.print(ziczac[i]);
		}
		
		System.out.println();
		
		System.out.println("000000000");
		
		
		
	}

}
