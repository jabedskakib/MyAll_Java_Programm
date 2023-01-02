package Collection;

import java.util.Collection;
import java.util.TreeSet;

public class Exp {

	public static void main(String[] args) {
		
		int n=7;
		
		int sp=n/2,st=1;
		
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<sp;j++)
			{
				System.out.print("  ");
			}
			
			for(int j=1;j<=st;j++)
			{
				if(j==1||j==st)
				{
					System.out.print("1 ");
				}else {
					System.out.print("* ");
				}
			}
			if(i<n/2)
			{
				sp--;
				st=st+2;
			}else {
				sp++;
				st=st-2;
			}
			System.out.println();
		}
		
		
		
		
	}
}
