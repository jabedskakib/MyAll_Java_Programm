import java.util.Scanner;

public class CheckDate {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Date DD ");
		int x=sc.nextInt();
		System.out.println("Enter Months MM");
		int y=sc.nextInt();
		System.out.println("Enter Years YYYY");
		int z=sc.nextInt();
		
		if (x>00&&x<=31) {
			System.out.println();
		}else {
			System.out.println("Invalid Date");
		}
		
		if (y>00&&y<=12) {
			System.out.println();
		}else {
			System.out.println("Invalid Date");
		}
		
		if (x>00&&x<31) {
			System.out.println();
		}else {
			System.out.println("Invalid Date");
		}
		
	}
}
