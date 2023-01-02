package Array;

public class Array2D {

	public static void main(String[] args) {
		
		int ar[][]= {{1,2,3},
					{4,5,6},
					{7,8,9}};
		
		
		int x=ar.length-1;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				
				if(j==2||i==2)
				{
					
					System.out.print(ar[i][j]+" ");
				}
			}
		}
		
		
	}
}
