package karu_linkedlist;

public class _48_modular_from_end
{
	public static Node modularFromEnd(Node head,int k)
	{
		//Same as finding nth from last element.
		return null;
	}
	
	
	public static void main(String[] args)
	{
		Node n1 = new Node(1);
		Node n2 = new Node(2,n1);
		Node n3 = new Node(3,n2);
		Node n4 = new Node(4,n3);
		Node n5 = new Node(5,n4);
		System.out.println(modularFromEnd(n5,5).data);
	}
}
