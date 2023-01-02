import java.util.*;

public class TryCatch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Divider");
		int n =sc.nextInt();
		try {

			System.out.println("1st Line ");
			System.out.println(100/n);
			System.out.println("3rd Line");
		}catch(ArithmeticException e ) {
			System.out.println("2nd Lines");
		}catch(NullPointerException np)
		{
			System.out.println("NullPointerException np");
		}
		
		finally {
			System.out.println("Alll");
		}
		
	}

}
