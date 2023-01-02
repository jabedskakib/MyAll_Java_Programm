
public class Avarage {
	
	public static void main(String[] args) {
		
		int n = 156;
		int count=0;
		int sum =0;
		int avg = 0;
		int temp = n;
		
		do {
			n=n/10;
			count++;
			
		}while(n!=0);
		System.out.println(count);
		
		
		do {
			int x =temp%10;
			sum = sum+x;
			temp=temp/10;
			
		}while(n!=0);
		System.out.println(temp);
		avg=sum/count;
		System.out.println(avg);
		
	}

}
