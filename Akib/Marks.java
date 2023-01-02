import java.util.*;
public class Marks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 4 Sub Number");

		int Eng = sc.nextInt();
		int Sci = sc.nextInt();
		int Math = sc.nextInt();
		int Geo = sc.nextInt();

		
		if (Eng<35) {
			System.out.println("Fail in Eng");
		}
		else {
			System.out.println("Pass in Eng");
		}
		if(Sci<35) {
			System.out.println("Fail in Sci");
		}
		else {
			System.out.println("Pass in Sci");
		}
		if(Math<35) {
			System.out.println("Fail in Math");
		}
		else {
			System.out.println("Pass in Math");
		}
		if(Geo<35) {
			System.out.println("Fail in Geo");
		}
		else {
			System.out.println("Pass in Geo");
		}
	}

}
