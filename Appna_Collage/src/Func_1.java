import java.util.Scanner;

public class Func_1 {

	// TODO Auto-generated constructor stub
	public static int calculate(int num1,int num2) {
		//int sum;
		int sum=(num1+num2);
		//System.out.println("The Sum is --> "+sum);
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The 1st input -->");
		int num1 = sc.nextInt();
		System.out.println("Enter The Sum 2nd input -->");
		int num2 = sc.nextInt();
		
		int sum = calculate(num1,num2);
		System.out.println("The Sum is --> "+sum);
		
	}

}
