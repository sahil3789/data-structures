package ds.linkedlist;

class LinkedList {

	private Node head;
	private int count;
	
	class Node{
		
		 int data;
		 Node next;
		
		Node(){		
			data = 0;
			next=null;
		}
	}
	
	LinkedList(){
		
		head = null;
	}
	
	void addFront(int data) {
		
		if(head==null) {
			Node node = new Node();
			node.data = data;
			node.next=null;
			head = node;
			count++;
			System.out.println("Node added at position:"+count+", value:"+data);
		}
		else {
			Node node = new Node();
			node.data = data;
			node.next=head;
			head = node;
			count++;
			System.out.println("Node added at position:"+count+", value:"+data);
		}
		
	}
	
	void addEnd(int data) {
		
		if(head==null) {
			Node node = new Node();
			node.data = data;
			node.next=null;
			head = node;
			count++;
			System.out.println("Node added at position:"+count+", value:"+data);
		}
		else {
			Node tmp = head;
			
			while(tmp.next!=null)
				tmp = tmp.next;
			
			Node node = new Node();
			node.data = data;
			node.next=null;
			tmp.next = node;
			count++;
			System.out.println("Node added at position:"+count +", value:"+data);
		}
		
	}
	
	void addPosition(int pos, int data) {
	
	if(head==null)
	{
		Node node = new Node();
		node.data = data;
		node.next=null;
		head = node;
		count++;
		System.out.println("Position not found, Node added at position: "+1+", value:"+data);
	}
	else if(pos>count+1) 
		addEnd(data);

	else if(pos==1) 
		addFront(data);

	else {
		
		Node prev = head;
		Node next = head;
		
		int i=1;
		while(i<pos) {
			prev = next;
			next=next.next;
			if(i==pos)
				break;
			i++;
		}
		Node node = new Node();
		node.data=data;
		node.next=next;
		prev.next=node;
		count++;
		System.out.println("Node added at position : "+pos+", value:"+data);

		}
		
	}
	
	void search(int data) {
	
		Node tmp = head;
		int i = 1;
		byte found = 0;
		while(tmp.next!=null)
		{
			if(tmp.data==data) {
				found=1;
				System.out.println("Node found at position: "+i);
			}
			i++;
			tmp=tmp.next;
		}
		
		if(found==0)
			System.out.println("Node not found");
	}
	
	void deletePosition(int pos) {
		
		if(head == null || pos < 1 || pos > count)
			System.out.println("No node found");
		else
		{
			Node prev = head;
			Node next = head;
			int i=1;
			
			while(i<pos) {
			
				prev = next;
				next=next.next;
				
				if(i==count)
					break;
				i++;
			}
			
			prev.next=next.next;
			count--;
			System.out.println("Node at position: "+pos+" deleted");
		}
	}
	
	void printList() {
	
		Node tmp = head;
		
		if(head==null)
			System.out.println("No node exists");
		else {
		while(tmp!=null)
			{	
				System.out.println(tmp.data);
				tmp=tmp.next;
			}
		}
	}
}
