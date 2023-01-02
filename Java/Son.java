
public class Son extends Father {
String bike="r15";
String model="43";
@Override
void father() {//override
	System.out.println("son class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s=new Son();
		s.father();//son class
		//System.out.println();
		

	}

}
