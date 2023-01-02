import java.util.*;
public class Num3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("");
		int x=100;
		int y=20;
		int z=30;
		
		if (x>y && x>z) {
			System.out.println(x+"is Biggest");
			if(y>z) {
				System.out.println(z+" is Small");
			}else {
				System.out.println(y+ " is Small");
			}
		}else if(y>z) {
			System.out.println(y+" is Biggest");
			if(x>z) {
				System.out.println(z+" is Small");
			}else
				System.out.println(x+" is Small");
		}else {
			System.out.println(z+" is Biggest");
			if(x>y) {
				System.out.println(y+" is Small");
			}else {
				System.out.println(x+" is Small");
			}
		}
	}

}
