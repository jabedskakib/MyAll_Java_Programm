
public class FindNum {

	public static void main(String[] args) {
		
		int n[]= {3,5,8,10,12,15,17};
		
		int x=10;
		
		int count = 0;
		
		for(int i=0;i<n.length;i++)
		{
			if(x==n[i])
			{
				System.out.println(x+" Position is -> "+count);
			}
			count++;
		}
		
	}
}
