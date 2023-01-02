package Method;

class Son implements Father ,Mother{
	int m=180;
	String a="Java";

	public void care()
	{
		System.out.println("Love");
	}

	public static void main(String[] args) {

		Son s1 = new Son();
		System.out.println(s1);
		s1.care();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.a +" "+this.m;
	}
}




