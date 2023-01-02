package MethodReturn;

public class BigArray {
	
	static int isBigArray(int x[],int n)
	{
		for(int i=0;i<x.length;i++) {
			int count =0;
			for(int j=0;j<x.length;j++)
			{
				if(x[j]>x[i])
				{
					count++;
					//System.out.print(count);
				}
			}
			if(count==n-1)
			{
				
				return x[i];
			}
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		
		int ar[]= {56,98,59,40,36,95,48};
		
		//isBigArray(ar,2);
		System.out.println(isBigArray(ar,6));
	}

}
