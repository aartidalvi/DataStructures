package karu_linkedlist;

public class _49_Fractional_Code
{
	public static Node findFractional(Node head,double k)
	{
		Node prev = null;
		if(head == null || k<=0 ) return null;
		double i=1;
		while(i%k != 0.0)
		{
			prev = head;
			head = head.next;
			i++;
		}
		return prev;
	}
	public static void main(String[] args)
	{
		Node n1 = new Node(100);
		Node n2 = new Node(90, n1);
		Node n3 = new Node(80, n2);
		Node n4 = new Node(70, n3);
		Node n5 = new Node(60, n4);
		Node n10 = new Node(50, n5);
		Node n20 = new Node(40, n10);
		Node n30 = new Node(30, n20);
		Node n40 = new Node(20, n30);
		Node n50 = new Node(10, n40);
		
		System.out.println(findFractional(n50,5.0).data);
	}
}
