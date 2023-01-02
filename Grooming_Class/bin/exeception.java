
class exeception {

	public static void main(String[] args) {
	System.out.println("start");
	System.out.println("statement 1");
try {
	//System.out.println("try start");
	System.out.println(100/0);
	//System.out.println("try end");
	int a[]= {};
	System.out.println();
}
catch(ArithmeticException  e) {
	System.out.println("this ia an arithmetic exception");
	
}
//catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("this ia an array index exception");
//}
System.out.println("end");
	}

}
