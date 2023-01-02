package Method;

public class Team {
	String cup_name;
	String match;
	
	Team(String a,String b){
		cup_name=a;
		match=b;
		
	}
	

	void ind() {
		
		System.out.println("\n---- TEAM INDIA ----\n");
		System.out.println("1. KL Rahul");
		System.out.println("2. Virat");
		System.out.println("3. Rohit");
		System.out.println("4. Panth");
		System.out.println("5. Dk");		
	}
	
	void aus() {
		
		System.out.println("\n---- TEAM Australia ----\n");
		System.out.println("1. Smith");
		System.out.println("2. Wanner");
		System.out.println("3. Maxwell");
		System.out.println("4. Finch");
		System.out.println("5. Commins");		
	}
	
	public static void main(String[] args) {
		Team t1 = new Team("World Cup","T20");
		System.out.println(t1.cup_name +" "+t1.match);
		t1.ind();
		t1.aus();
		
		
	}
	
	

}
