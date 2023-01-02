import java.lang.reflect.Array;
import java.util.Arrays;

public class ShortedArray {

	public static void main(String[] args) {
		
		int n[]= {65,62,5,6,25,625,526,56,268,24,89,96};
		
//		for(int i=0;i<n.length;i++)
//		{
//			int temp=0;
//			for(int j=i+1;j<n.length;j++)
//			{
//				if(n[i]>n[j])
//				{
//					temp=n[i];
//					n[i]=n[j];
//					n[j]=temp;
//				}
//			}
//		}
		
		
		Arrays.sort(n);
		
		
		for(int i=0;i<n.length;i++)
		{
			System.out.print(n[i]+" ");
		}
		
	}
}
