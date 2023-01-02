
public class MargeShortArray {

	public static void main(String[] args) {
		
		int x[]= {5,90,25,86,20};
		int y[]= {8,26,29,70,80};
		int z[]=new int[x.length+y.length];
		
		int count=x.length;
		
		for(int i=0;i<x.length;i++)
		{
			z[i]=x[i];
			z[count]=y[i];
			count++;
			
		}
		System.out.println("1st Array");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println("\n");

		System.out.println("2nd Array");
		for(int i=0;i<y.length;i++)
		{
			System.out.print(y[i]+" ");
		}

		System.out.println("\n");
		
		System.out.println("Marge 2 Array -");
		for(int i=0;i<z.length;i++)
		{
			System.out.print(z[i]+" ");
		}
		

		System.out.println("\n");
		System.out.println("Assending Order Array");
		for(int i=0;i<z.length;i++)
		{
			for(int j=0;j<z.length;j++)
			{
				if(z[i]<z[j])
				{
					int temp = z[i];
					z[i]=z[j];
					z[j]=temp;
				}
			}
		}
		
		for(int i=0;i<z.length;i++)
		{
			System.out.print(z[i]+" ");
		}
		

		System.out.println("\n");
		System.out.println("Desending Order Array");
		for(int i=0;i<z.length;i++)
		{
			for(int j=0;j<z.length;j++)
			{
				if(z[i]>z[j])
				{
					int temp = z[i];
					z[i]=z[j];
					z[j]=temp;
				}
			}
		}
		for(int i=0;i<z.length;i++)
		{
			System.out.print(z[i]+" ");
		}
	}
}
