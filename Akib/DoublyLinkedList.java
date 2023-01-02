
public class DoublyLinkedList {

	class Node
	{
		Object data;
		Node next;
		Node prev;
		Node (Object data)
		{
			this.data=data;
		}
	}

	Node head;
	// Add Elements
	
	void add(Object data)
	{
		Node n = new Node(data);
		
		if(head == null)
		{
			head=n;
			return;
		}
		Node temp = head;
		
		while(temp.next!=null)
		{
			temp =temp.next;
		}
		temp.next=n;
		n.prev=temp;
	}
	
	public String toString()
	{
		String st = "[ ";
		Node temp = head;
		while(temp !=null)
		{
			st =st+temp.data;
			if(temp.next !=null)
			{
				st = st+"<=>";
				
			}
			temp = temp.next;
		}
		
		
		return st+" ]";
	}
	
	public void addFrist(Object data)
	{
		Node n = new Node(data);
		n.next=head;
		if(head != null)
		{
			head.prev=n;
		}
		head=n;
		return;
	}
	
	
	

	public int deleteFirst() {
		
		if(head == null)
		{
			System.out.println("List is Empty...");
			
		}

		
		return null;
	}
	
	
	
}
