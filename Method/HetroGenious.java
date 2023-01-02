package Method;

public class HetroGenious {
	String name;
	String branch;
	int yop;
	
	HetroGenious(String n,String b, int y)
	{
		this.name=n;
		this.branch=b;
		this.yop=y;
	}

	void details()
	{
		System.out.println(name+" "+branch+" "+yop);
	}
	
	public static void main(String[] args) {
		HetroGenious s1=new HetroGenious("Akib","MCA",2020);

		HetroGenious s2=new HetroGenious("Sudhir","BCA",2021);

		HetroGenious s3=new HetroGenious("Alam","Btech",2021);
		
		HetroGenious s4=new HetroGenious("Vinod","Btech",2022);

		HetroGenious s[]= {s1,s2,s3,s4 };
		
	for(int i=0;i<s.length;i++)
	{
			s[i].details();		
	}
	
	System.out.println(null);

	}
	
	
	
}
