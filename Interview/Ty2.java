package Interview;

public class Ty2 {
	public static void main(String[] args) {
		
		
		String s="Hello Java World";
		
		String sr[]=s.split(" ");
		String rs ="";
		
		for(int i=0;i<sr.length;i++)
		{
			char ch[]=sr[i].toCharArray();
			System.out.print(ch);
		}
		
		
		
	}

}
