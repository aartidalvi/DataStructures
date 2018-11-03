package karu_linkedlist;

public class _32_Merge_Sorted_Linked_List
{	
	public static Node Merge(Node first,Node second) 
	{
		if(first == null) return second;
		if(second == null) return first;
		Node head;
		if(first.data < second.data)
		{
			head = first;
			head.next = Merge(first.next, second);
		}
		else
		{
			head = second;
			head.next = Merge(first,second.next);
		}
		return head;
	}
	
	public static void printStack(Node temp)
	{
		while(temp!=null)
		{
			System.out.print(temp.data + "\t");
			temp = temp.next;
		}
		System.out.println("done");
	}
	
	public static void main(String[] args) 
	{

		Node n1 = new Node(5);
		Node n2 = new Node(4,n1);
		Node n3 = new Node(3,n2);
		Node n4 = new Node(2,n3);
		Node n5 = new Node(1,n4);
		
		
		Node n10 = new Node(50);
		Node n20 = new Node(40,n10);
		Node n30 = new Node(30,n20);
		Node n40 = new Node(20,n30);
		Node n50 = new Node(10,n40);
		
		printStack(Merge(n5, n50));
	}
}
