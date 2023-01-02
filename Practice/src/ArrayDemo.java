import java.lang.*;
import java.lang.reflect.Array;
import java.util.*;

public class ArrayDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1;
		
		System.out.println(a+" ");
		
		if(n>1) {
			for(int i=2;i<n;i++)
			{
				if(b<n) {
					System.out.println(b+" ");
					int temp=b;
					b=a+b;
					a=temp;
				}
				
				
			}
		}
		
		
		
		
	}

}
