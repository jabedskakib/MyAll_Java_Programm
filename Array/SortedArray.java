package Array;

public class SortedArray {
	public static void main(String[] args) {

		int ar[]= {6,45,21,85,96,45,23,15,3};
		System.out.println("Before Sorted");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+", ");
		}
		System.out.println();
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		
		System.out.println("after Sorted");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+", ");
		}
		
	}

}
