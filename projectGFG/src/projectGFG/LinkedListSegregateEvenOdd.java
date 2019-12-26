package projectGFG;

public class LinkedListSegregateEvenOdd {
	
	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int val){
			this.data = val;
			this.next = null;
		}
	};
	
	
	
	public static void segregateEvenOdd() {
		Node prev = null;
		Node current = head;
		Node end = head;
		
		while(end.next != null)
			end = end.next;
		
		Node new_node = end;
		while(current.data % 2 != 0 && current != end) {
			new_node.next = current;
			current = current.next;
			new_node.next.next = null;
			new_node = new_node.next;
		}
		if(current.data % 2 == 0) {
			head = current;
			while(current != end) {
				if(current.data % 2 == 0) {
					prev = current;
					current = current.next;
				}else {
					prev.next  = current.next;
					current.next  = null;
					new_node.next = current;
					new_node =  current;
					current = prev.next;
				}
			}
		}else prev = current;
		if(end.data % 2 != 0 && new_node != end) {
			prev.next = end.next;
			end.next = null;
			new_node.next = end;
		}
		
	}
	
	public static void push(int val) {
		
		Node node = new Node(val);
		node.next = head;
		head = node;
	}
	public static void 	printList() {
		Node current = head;
		while(current!= null) {
			System.out.print(current.data+"  ---->");
			current =  current.next;
		}
	}
	public static void main(String[] args) {
		push(12);
		push(234);
		push(89);
		push(34);
		push(90);
		push(76);
		push(55);
		push(67);
		printList();
		System.out.println();
		segregateEvenOdd();
		printList();
	}

}
