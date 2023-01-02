
public class Shorted {
	
	public static void main(String[] args) {
		
		int a[]= {5,6,8,7,3,2};
		int count = 0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					count++;
				}
			}
		}
		System.out.println(count);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
		
		
	}

}
