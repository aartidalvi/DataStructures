package karu_linkedlist;

public class _30_Length_Odd_Even 
{
	public static boolean isEvenLength(Node head)
	{
		while(head != null && head.next!=null)
		{
			head = head.next.next;
		}
		if(head == null)
			return true;
		return false;
	}
	
	public static void main(String[] args) 
	{
		Node n1 = new Node(1);
		Node n2 = new Node(2,n1);
		Node n3 = new Node(3,n2);
		Node n4 = new Node(4,n3);
		Node n5 = new Node(5,n4);
		System.out.println(isEvenLength(n5));
		Node n6 = new Node(6,n5);
		System.out.println(isEvenLength(n6));
	}
}
