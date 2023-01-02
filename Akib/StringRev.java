import java.util.*;

public class StringRev {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		String s= sc.nextLine();
		
		String st[]=s.split(" ");
		String str="";
		for(int i=st.length-1;i>=0;i--)
		{
			System.out.print(st[i]+" ");
		}
		
		
	}
}
