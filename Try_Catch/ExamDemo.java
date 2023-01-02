package Try_Catch;

public class ExamDemo {
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		try {
			System.out.println("try-start");
			try {
				System.out.println(100/0);
			}catch(ArithmeticException e){
				System.out.println("Nested try-catch");
			}
			
			int a[]= {1,2,3,4,5};
			System.out.println(a[4]);
			System.out.println("try-end");
		}catch (ArithmeticException e) {

			System.out.println("Arithmetic Exception");
		}
		System.out.println("End");
		
	}

}
