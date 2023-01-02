import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st Value");
		int a=sc.nextInt();
//		
//		System.out.println("Enter 2nd Value");
//		int b=sc.nextInt();
//		
////		a=a+b;
////		b=a-b;
////		a=a-b;
//		
//		int c= a;
//		a=b;
//		b=c;
//		
//		System.out.println(" A = "+a);
//		System.out.println(" B = "+b);
		
		if(a/2*2==a)
		{
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
		
		
	}

}
