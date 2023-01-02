
public class Special {
	
	public static void main(String[] args) {
		
		int n=56;
		
		int d1=n/10;
		int d2=n%10;
		
		int sum = d1+d2+d1*d2;
		
		if(sum==n) {
			System.out.println("Special");
		}else {
			System.out.println("Not Special");
		}
		
	}	

}
