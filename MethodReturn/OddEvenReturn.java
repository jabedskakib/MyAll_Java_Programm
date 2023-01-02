package MethodReturn;
import java.util.Scanner;
public class OddEvenReturn {
	static int isOddEvenReturn(int x) {
		int sumOfEven = 0;
		int sumOfOdd = 0;
		
		while(x!=0) {
//			if(x%2==0) {
//				sumOfEven=sumOfEven+x;
//			}else {
//				sumOfOdd=sumOfOdd+x;
//			}
//			x--;
			
			
			int y = x%10;
			if(y%2==0) {
				sumOfEven=sumOfEven+y;
			}else {
				sumOfOdd=sumOfOdd+y;
			}		
			x=x/10;
		}
		int sum = sumOfEven-sumOfOdd;
		return sum;
//		System.out.println("The Sum of Even Number is -- "+sumOfOdd);
//		return sumOfEven;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number -- ");
		int x=sc.nextInt();
		int oddEven=isOddEvenReturn(x);
		System.out.println("Difference B/W Odd Even Number is -- "+oddEven);
	}


}
