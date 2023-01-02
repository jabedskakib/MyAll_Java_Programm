package MethodReturn;
import java.util.*;

public class SumofNatural {
	static int isSumOfNatural(int x) {
		int sum = 0;
		
		while(x!=0) {
			int y = x;
			sum=sum+y;
			x--;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number -- ");
		int x=sc.nextInt();
		int natural=isSumOfNatural(x);
		System.out.println("Som of Natural Number is -- "+natural);
	}
}
