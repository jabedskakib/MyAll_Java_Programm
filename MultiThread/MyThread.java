package MultiThread;

public class MyThread {
	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++)
		{
			MultiTherad mt = new MultiTherad(i);
			
			Thread mymt = new Thread(mt);
			mymt.start();
		}	
	}
}
