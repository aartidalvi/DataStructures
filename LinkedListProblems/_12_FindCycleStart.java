package karu_linkedlist;

public class _12_FindCycleStart
{
	public static int findStart(Node node)
	{
		Node fast = node ,slow = node ;
		boolean isCycle = false;
		
		while(fast != null && fast.next!= null)
		{
			slow = slow.next;
			fast = fast.next == null ? null : fast.next.next;
			if(slow == fast)
			{
				isCycle = true;
				break;
			}
		}
		if(isCycle)
		{
			slow = node;
			while(fast != slow)
			{
				fast = fast.next;
				slow = slow.next;
			}
			return fast.data;
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		Node n1 = new Node(1);
		Node n2 = new Node(2,n1);
		Node n3 = new Node(3,n2);
		Node n4 = new Node(4,n3);
		Node n5 = new Node(5,n4);
		
		Node n6 = new Node(5,n5);
		n5.next = n3;
		n3.next = n4;
		System.out.println(findStart(n6));
	}
}
