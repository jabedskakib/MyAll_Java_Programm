import java.util.*;
public class Biggest3num {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 Number");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();

		if (x>y && x>z) {
			System.out.println(x+" is Biggest");
			if(y>z) {
				System.out.println(y+" is Biggest" );
			}else {
				System.out.println(z+" is Smallest" );
			}
		}else if(y>z) {
			System.out.println(y+" is Biggest" );
			if(x>z) {
				System.out.println(x+" is Biggest" );
			}else {
				System.out.println(z+" is Smallest" );
			}
		}else {
			System.out.println(z+" is Biggest");
			if(y>x) {
				System.out.println(y+" is Biggest" );
			}else {
				System.out.println(x+" is Smallest" );
			}
		}

	}
}
