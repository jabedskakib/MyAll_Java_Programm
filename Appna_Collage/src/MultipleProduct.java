import java.util.Scanner;

public class MultipleProduct {

	public static int calculate(int a,int b) {
		return a*b;
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The 1st input -->");
		int a = sc.nextInt();
		System.out.println("Enter The Sum 2nd input -->");
		int b = sc.nextInt();
		
		System.out.println("Product of two number :--"+calculate(a, b));
	}
	

}
