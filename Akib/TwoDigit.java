import java.util.*;
public class TwoDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter num :- ");
		
		int x=sc.nextInt();
		if(x >=100&&x<=999||x<=-100&&x>=-999) {
			System.out.println("This is 3 Digit num");
			
		}else
			System.out.println("Not 3 Digit");
		
}
}
