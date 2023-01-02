package Array;

public class ZigZak {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,10,11};

		int c[]=new int[a.length+b.length];
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			c[j]=a[i];
			j=j+2;
		}
		j=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==0) {
				c[i]=b[j++];
				
			}
			
			
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		
		
		
	}

}
