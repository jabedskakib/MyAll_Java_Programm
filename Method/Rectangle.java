package Method;

public class Rectangle {
	int rectangle;
	int rec(int x,int y) {
		int rectangle = x*y;
		//System.out.println(rectangle);
		return rectangle;
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		int t=r.rec(15,20);
		System.out.println(t);
	}
}
