
public class BinaryToDesimal {
	
	static int binaryToDesimal(int n) {
		int dec=0;
		int pw=1;
	
		do {
			int x=n%10;
			
			dec=dec+x*pw;
			
			pw=pw*2;
			n=n/10;
			
		}while(n!=0);
		
		return dec;
	}
	
	public static void main(String[] args) {
	
		int n = 10101001;
		System.out.println("Desimal Num is - "+binaryToDesimal(n));
		
	}

}
