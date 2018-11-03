package karu_linkedlist;

public class _17_Reverse_List 
{
	public static Node reverse(Node head)
	{
		if(head == null || head.next == null)
			return head;
		
		Node prev = null,current = head;
		while(current != null)
		{
			Node next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
	
	public static void reverseRecurse(Node current)
	{
		
	}
	
	public static void printStack(Node head)
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data + "\t");
			temp = temp.next;
		}
		System.out.println("done");
	}
	
	public static void main(String[] args) 
	{
		Node n1 = new Node(1);
		Node n2 = new Node(2,n1);
		Node n3 = new Node(3,n2);
		Node n4 = new Node(4,n3);
		Node n5 = new Node(5,n4);
		
		printStack(n5);
		printStack(reverse(n5));
		
	}
}
