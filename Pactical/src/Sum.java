
public class Sum {
	public static void main(String[] args) {
//		int i=2,sum=0; int n=7;
//		while(n>1) {
//			
//			if(n%i==0) {
//				System.out.println("even");
//			}else
//			{
//				System.out.println("odd");
//			}
//			
//		}
		
		int n=10;
		int count=0;
		for(int i=2;i<=n/2;i++) {
			count++;
			System.out.print(i);
			if(n%i==0)
			{
				System.out.println("Not Prime");
				
			}else {
				System.out.println("Prime");
				
			}
		
		}
		
		System.out.println(count);
		
		
	}

}
