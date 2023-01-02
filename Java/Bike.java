public class  Bike
{
	public static void main(String[] args) {
		
	
		int a[]={1,3,4,0,2,1,3,4,1};
		int b[]=new int[a.length]; 

		b[0]=a[0];

		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] != a[j])
				{
					b[i]=a[i];
				}
			}
		}
		for(int i=0;i<b.length;i++)
		{
			if(b[i] !=0)
			{
				System.out.println(b[i]);
			}	
		}
	}
}
