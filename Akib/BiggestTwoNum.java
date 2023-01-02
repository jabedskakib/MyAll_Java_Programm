
import java.util.Scanner;
public class BiggestTwoNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		System.out.println("Enter the element");
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int h1=arr[0];
		int h2=arr[1];
		for (int i = 0; i < arr.length; i++) {
			if(h1<arr[i]){
				h2=h1;
				h1=arr[i];
			}
			else if(arr[i]>h2&&h1!=arr[i]){
				h2=arr[i];
			}
		}
		System.out.println("1st biggest = "+h1);
		System.out.println("2nd biggest = "+h2);
	}
}
