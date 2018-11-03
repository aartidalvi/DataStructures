package karu_linkedlist;

public class _33_Merge_Without_Recursion
{
	public static Node Merge(Node first,Node second)
	{
		Node head = new Node(Integer.MAX_VALUE);
		
		while(first!=null && second!=null)
		{
			if(first.data <= second.data)
			{
				head.next = first;
				first = first.next;
			}
			else
			{
				head.next = second;
				second = second.next;
			}
			head = head.next;
		}

		if(first != null)	head.next = first;
		else if(second != null)	head.next = second;

		return head;
	}
	public static void main(String[] args)
	{
		System.out.println("Input:");
		Node n1 = new Node(55);
		Node n2 = new Node(44,n1);
		Node n3 = new Node(33,n2);
		Node n4 = new Node(22,n3);
		Node n5 = new Node(11,n4);
		Node.printFromTop(n5);
		
		Node n10 = new Node(50);
		Node n20 = new Node(40,n10);
		Node n30 = new Node(30,n20);
		Node n40 = new Node(20,n30);
		Node n50 = new Node(10,n40);
		Node.printFromTop(n50);
		
		System.out.println("Output:");
		Node.printFromTop(Merge(n5, n50));
	}
}
