import java.util.Scanner;

public class Squere {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number :- ");
		int num=sc.nextInt();
		
		System.out.println("Enter Squere Number :- ");
		int sq=sc.nextInt();
		
		int sum =1;
		for(int i=1;i<=sq;i++) {
			
			sum = sum*num;
		}
		System.out.println(sum);
		
		
	}

}
