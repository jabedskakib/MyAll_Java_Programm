package MultiThread;

//public class MultiTherad extends Thread{
public class MultiTherad implements Runnable{	
	private int thNum;
	public MultiTherad(int thNum)
	{
		this.thNum=thNum;
	}
	
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+" From Thread Num "+thNum);
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
