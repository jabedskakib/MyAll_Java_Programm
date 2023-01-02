import java.util.Scanner;
class happynumber {
	static boolean happy(int n) {
		while(n>9) {
			int sum=0;
			while(n!=0) {
				int d=n%10;
				sum=sum+d*d;
				n=n/10;
				
			}
			n=sum;
		}
		return n==1||n==7;
	}
	static void happyno(int n) {
		System.out.println("no of happy no");
		for(int i=1;i<=n;i++) {
			if(happy(i)) {
				System.out.print(i+" ");
			}
		}
		
	}
 static int counthappy(int n) {
	 int count=0;
	 for(int i=0;i<n;i++) {
		 if(happy(i)) {
			count++;
		 }
		 	 }
	 return count;

 }

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
	boolean r=happy(n);
	if(r) {
		System.out.println("happy number");
	}
	else {
		System.out.println("not a happy number");
	}
	happyno(n);
	int cmt=counthappy(n);
	System.out.println("count happy number : "+cmt);
		
	}

}
