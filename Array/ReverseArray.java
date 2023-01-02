package Array;
import java.util.*;
public class ReverseArray {
	
	static void revArray(int a[]) {
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		
//		int a[]= {5,8,9,6,8,4,3};
		//System.out.println(a);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Array Size :- ");
		int n = sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<=n-1;i++)
		{
			System.out.print("Enter "+i+" Array :- ");
			a[i]=sc.nextInt();
		}
		
		
		revArray(a);
		
		
	}

}
