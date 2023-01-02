package Method;

class son2 extends father1{
String bike="bmw sports";
void play() {
	System.out.println("playing with his wife");
}
	public static void main(String[] args) {
		father1 f= new son2();
	  // System.out.println(f.bike);
	   System.out.println(f.money);
	   son2 s= (son2)f;
	   System.out.println(s.money);
	   System.out.println(s.bike);
	   s.play();
	   s.drink();

	}

}
