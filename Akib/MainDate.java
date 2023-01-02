import java.util.*;
public class MainDate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st date(dd mm yyyy");
		int d1=sc.nextInt();
		int m1=sc.nextInt();
		int y1=sc.nextInt();
		Date dt1=new Date(d1,m1,y1);
		
		System.out.println("Enter 2nd date(dd mm yyyy");
		int d2=sc.nextInt();
		int m2=sc.nextInt();
		int y2=sc.nextInt();
		Date dt2=new Date(d2,m2,y2);
		
		System.out.println("Frist Date -"+dt1);
		System.out.println("Scond Date -"+dt2);
		
		int days=dt2.noOfDay()-dt1.noOfDay();
		
		System.out.println("Number of Days Between these two Dates :- "+days);
		
		System.out.println(dt1+"Day Name is "+dt1.getDayName());
		System.out.println(dt2+"Day Name is "+dt2.getDayName());
		
	}
}
