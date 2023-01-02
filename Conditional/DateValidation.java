package Conditional;
import java.util.*;
public class DateValidation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number :-- ");
		int d=sc.nextInt();
		int m=sc.nextInt();
		int y=sc.nextInt();
		
		String s = (d>31||d<1&&m<1||m>12&&y<1)?"Invalid 1":
					((m==4||m==6||m==9||m==11)&&d>30)?"Invalid 2":
					(m==2&&d>29)?"Invalid 3":((y%4==0&&y%100!=0)||
					y%400==0)==false&&m==2&&d>28?"Invalid 4":"Valid";
		
		System.out.println(s);
		
//		if (d>31||d<1&&m<1||m>12&&y>1) {
//			System.out.println("Invalid 2");
//		}else if((m==4||m==6||m==9||m==11)&&d>30) {
//			System.out.println("Invalid 2");
//		}else if (m==2&&d>28) {
//			System.out.println("Invalid 3");
//		}else {
//			System.out.println("Valid");
//		}
	}

}
