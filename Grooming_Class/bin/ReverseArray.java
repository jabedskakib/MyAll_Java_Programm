import java.util.*;
public class ReverseArray {

	private static void isReverse(int[] x) {
		
		for(int i=x.length-1;i>=0;i--)
		{
			System.out.print(x[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		int x[]= {5,9,8,6,3,4,2};
		
		isReverse(x);
		
	}

	
}
