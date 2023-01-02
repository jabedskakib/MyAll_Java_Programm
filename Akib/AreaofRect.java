import java.util.Scanner;
public class AreaofRect {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of rect: ");
		int l=sc.nextInt();
		System.out.println("Enter the breath of rect: ");
		int b=sc.nextInt();
		int area=(l*b);
		int p=(l+b)*2;
		System.out.println("Area of rectangle: "+area);
		System.out.println("Parimeter of rect: "+p);

	}

}
