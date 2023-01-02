package HackerRank;
import java.util.*;
public class SumofArray {
	
	static int[] rev(int a[])
	{
		int i=0;
		int b[]=new int[a.length];
		int j=a.length-1;
		while(i < a.length)
		{
			b[i++]=a[j--];
			
		}
		return b;
	}
	static int sumx(int a[])
	{
		int sum = a[0];
		for(int i=1;i<a.length;i++)
		{
			sum = sum * 10+a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
//		int l1[]= {2,4,3};
//		int l2[]= {5,6,4};
		int l1[] = {9,9,9,9,9,9,9};
		int l2[] = {9,9,9,9};
		
		l1=rev(l1);
		l2=rev(l2);
		
		int x1=sumx(l1);
		int x2=sumx(l2);
		
		int sum = x1+x2;
		
		System.out.println(sum);
		int res[]=new int[l1.length];
		int i=0; 
		while(sum!=0)
		{
			int t=sum%10;
			res[i++]=t;
			sum=sum/10;
		}
		
		for(int j=0;j<res.length;j++)
		{
			System.out.print(res[j]+" ");
		}
		
	}

}
