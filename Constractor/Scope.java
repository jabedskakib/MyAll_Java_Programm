package Constractor;

class Scope {
	String s;
	String k;
	String l; 
	String j;
	
	Scope(){
		
	}
	Scope(String a){
		this.s=a;
		System.out.println(this.s);
	}
	Scope(String a, String b){
		this.s=a;
		this.k=b;
		System.out.println(this.s+ " "+this.k);
	}
	Scope(String a, String b,String c){
		this.j=c;
		this.k=b;
		this.s=a;
		System.out.println(this.s+ " "+this.k+" " +this.j);
	}
	Scope(String a, String b,String c,String d){
		this.j=c;
		this.k=b;
		this.s=a;
		this.l=d;
		
		System.out.println(this.s+ " "+this.k +" "+this.j+" "+this.l);
	}
	public static void main(String[] args) {
		new Scope();
		new Scope("Akib");
		new Scope("Akib","Jabed");
		new Scope("Akib","Jabed","Java");
		new Scope("Akib","Jabed","Java","Developer");
		
		
	}

}
