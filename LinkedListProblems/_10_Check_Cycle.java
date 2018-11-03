package karu_linkedlist;

public class _10_Check_Cycle 
{
	public static boolean ifCycle(Node node)
	{
		Node fast = node,slow = node;
		while(fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = (fast == null ? null : fast.next.next);
			if(fast == slow)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) 
	{
		Node n1 = new Node(1);
		Node n2 = new Node(2,n1);
		Node n3 = new Node(3,n2);
		Node n4 = new Node(4,n3);
		Node n5 = new Node(5,n4);
		
		System.out.println(ifCycle(n5));
		
		Node n6 = new Node(5,n5);
		n5.next = n3;
		n3.next = n4;
		System.out.println(ifCycle(n6));
	}
}
