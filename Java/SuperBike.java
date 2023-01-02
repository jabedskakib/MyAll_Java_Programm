
public class SuperBike {

	String model;
	String engine;
	String topspeed;
	int price;
	SuperBike(String m,String e,String ts,int p) {
		// TODO Auto-generated constructor stub
	
		this.model=m;
		this.engine=e;
		this.topspeed=ts;
		this.price=p;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperBike s1 = new SuperBike("Kawasaki Z650","649 cc","210 kmph",594000);
		SuperBike s2 = new SuperBike("Street Triple R","765 cc","225 kmph",884000);
		SuperBike s3 = new SuperBike("Ducati Panigale V2","955 cc","257 kmph",1700000);
		
		System.out.println(s1.model+" "+s1.engine+" "+s1.topspeed+" "+s1.price);
		System.out.println(s2.model+" "+s2.engine+" "+s2.topspeed+" "+s2.price);
		System.out.println(s3.model+" "+s3.engine+" "+s3.topspeed+" "+s3.price);
	}

}
