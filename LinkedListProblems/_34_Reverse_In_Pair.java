package karu_linkedlist;

public class _34_Reverse_In_Pair 
{
	public static Node reversePairRecursive(Node head)
	{
		Node temp;
		if(head == null || head.next == null)
			return head;
		else
		{
			temp = head.next;
			head.next = temp.next;
			temp.next = head;
			head = temp;
			head.next.next = reversePairRecursive(head.next.next);
			return head;
		}
	}
	
	public static Node reversePairIterative(Node head)
	{
		Node temp1 = null;
		Node temp2 = null;
		
		if(head == null || head.next == null)
			return head;
		
		while(head != null || head.next != null)
		{
			if(temp1 != null)
				temp1.next.next = head.next;
			temp1 = head.next;
			head.next = head.next.next;
			temp1.next = head;
			if(temp2 == null)
				temp2 = temp1;
			head = head.next;
		}
		
		return temp2;
	}
	
	public static void main(String[] args)
	{
		Node n1 = new Node(100);
		Node n2 = new Node(90,n1);
		Node n3 = new Node(80,n2);
		Node n4 = new Node(70,n3);
		Node n5 = new Node(60,n4);		
		Node n10 = new Node(50,n5);
		Node n20 = new Node(40,n10);
		Node n30 = new Node(30,n20);
		Node n40 = new Node(20,n30);
		Node n50 = new Node(10,n40);
		Node.printFromTop(n50);
		
		Node.printFromTop(reversePairRecursive(n50));
	}
}
