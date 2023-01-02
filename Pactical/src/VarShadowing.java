
public class VarShadowing {

	String n="Akib";
	
	void dis() {
		String n = "Jabed";
		System.out.println(n);
		System.out.println(this.n);
		
	}
	public static void main(String[] args) {
		VarShadowing v1=new VarShadowing();
		
		v1.dis();
	}
}
