package karu_linkedlist;

//n is not given - length of linked list
//k is given
//example : n = 19, k = 3 , return 18th Node
public class _47_Modular_Node
{
	public static Node modular(Node head,int k)
	{
		int i=0;
		Node mod = null;
		if(head == null || k<=0)
			return null;
		while(head != null)
		{
			if(i%k == 0)
			{
				mod = head;
			}
			head = head.next;
			i++;
		}
		return mod;
	}
	
	public static void main(String[] args)
	{
		Node n1 = new Node(1);
		Node n2 = new Node(2,n1);
		Node n3 = new Node(3,n2);
		Node n4 = new Node(4,n3);
		Node n5 = new Node(5,n4);
		System.out.println(modular(n5,5).data);
	}
}
