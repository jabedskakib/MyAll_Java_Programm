import java.util.Scanner;
public class Pass$fail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 4 subject marks");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		if(a>35&&b>35&&c>35&&d>35)
			System.out.println("pass");
		else
			System.out.println("fail");
		//if(a<35&&a<100)
		

	}

}
