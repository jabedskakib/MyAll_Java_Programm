
public class BigSmallArray {

	public static void main(String[] args) {
		
		
		int n[]= {8,59,26,48,52,69,35,52};
		
		int big=n[0],small=n[0];
		
		for(int i=1;i<n.length;i++)
		{
			if(n[i]>big)
			{
				big=n[i];
			}
			
			if(n[i]<small)
			{
				small=n[i];
			}
			
		}
		
		System.out.println("Biggest Array Number is :- "+big);
		
		System.out.println("Small Array Number is :- "+small);
	}
}
