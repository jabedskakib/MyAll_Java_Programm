import java.util.*;
public class Double4Num {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		double z=sc.nextDouble();
		double s=sc.nextDouble();
		
		double small=s;
		
		if (x<small) {
			small=x;
		}
		if (y<small) {
			small=y;
		}
		if (z<small) {
			small=z;
		}
		System.out.println("Smaller Number is "+small);
		
	}
}
