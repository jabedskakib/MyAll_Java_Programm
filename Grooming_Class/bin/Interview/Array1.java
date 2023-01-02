package Interview;

public class Array1 {
	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5};
		int arr[] = new int[ar.length]; 
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				arr[count++]=ar[i];
				//count++;
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==1)
			{
				arr[count++]=ar[i];
				//count++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
