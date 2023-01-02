package Try_Catch;

import java.io.IOException;

public class ExpDemo {
	public static void main(String[] args)
	{

		try {
			System.out.println(100/0);
		}catch(NullPointerException v) {
			System.out.println("Not Divisible - 1");
		}catch(ArithmeticException a) {
			
			System.out.println("Not Divisible - 3");
			
		}catch (Exception e) {
			System.out.println("Not Divisible - 2");
		}


	}

}
