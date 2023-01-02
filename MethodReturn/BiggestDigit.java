package MethodReturn;
import java.util.*;
public class BiggestDigit {

	static int isBigDigit(int n)
	{
		int big=0;
		while(n!=0) {
			int y= n%10;
			if(big<y) {
				big=y;
			}
			n=n/10;
		}
		return big;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number - ");
		int n = sc.nextInt();
		int bigDigit = isBigDigit(n);

		System.out.println(bigDigit);



	}

}
