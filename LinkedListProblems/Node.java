package karu_linkedlist;

public class Node
{
	int data;
	Node next = null;
	
	public Node(int data, Node next)
	{
		super();
		this.data = data;
		this.next = next;
	}
	
	public Node(int data)
	{
		super();
		this.data = data;
	}
	
	public static void printFromTop(Node temp)
	{
		while(temp!=null)
		{
			System.out.print(temp.data + "\t");
			temp = temp.next;
		}
		System.out.println("done");
	}
	
	public static void printCircular(Node temp)
	{
		Node head = temp;
		
		do
		{
			System.out.print(temp.data + "\t");
			temp = temp.next;
		}while(temp!=head);
		
		System.out.println("done");
	}
}
