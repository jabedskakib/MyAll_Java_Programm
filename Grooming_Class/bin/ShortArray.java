
public class ShortArray {

	public static void main(String[] args) {
		
		int n[]= {9,8,6,7,25,93,84,69,25,45}; 
		
		for(int i=0;i<n.length;i++)
		{
			
			for(int j=i+1;j<n.length;j++)
			{
				int temp=n[i];
				if(n[i]>=n[j])
				{
					n[i] = n[j];  
					n[j] = temp;
				}
			}
		}
		for(int i=0;i<n.length;i++)
		{

			System.out.println(n[i]);
		}
		
	}
}
