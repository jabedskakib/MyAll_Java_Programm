
public class MainDoublyLinkedList {
	public static void main(String[] args) {
		DoublyLinkedList dl = new DoublyLinkedList();
		
		dl.add(85);
		dl.add(92);
		dl.add(75);
		dl.add(65);
		System.out.println(dl);
		
		dl.addFrist(35);
		System.out.println(dl);
		
		System.out.println(dl.deleteFirst());
		
	}

}
