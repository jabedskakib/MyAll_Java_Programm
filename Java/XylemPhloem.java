import java.util.*; 
public class XylemPhloem {
	static String checknp(int n) {
		int os=0,ms=0;
		os=os+n%10;
		n=n/10;
		while(n>9) {
			ms=ms+n%10;
			n=n/10;

		}
		os=os+n;
		if(os==ms) {
			return "xylem";
		}else
			return  "pholem";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		String result =checknp(n);
		System.out.println("is a  "+result+"  number");
	}

}


