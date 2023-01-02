import java.util.*;
public class Marge2Array {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 1st Array Size :- ");
//		int size=sc.nextInt();
//		
//		System.out.println("Enter 2nd Array Size :- ");
//		int size1=sc.nextInt();
		
		
		int x[]= {5,9,8,6,3,4,2};
		
		int y[]= {8,59,4,8,2,9,10};
		
		int z[]= new int[x.length+y.length];
		int count=x.length;
		for(int i=0;i<x.length;i++)
		{
			z[i]=x[i];

			z[count]=y[i];
			count++;
		}

		for(int i=0;i<z.length;i++)
		{
			System.out.print(z[i]+" ");
		}
	}

}
