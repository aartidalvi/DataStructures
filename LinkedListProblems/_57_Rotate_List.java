package karu_linkedlist;

public class _57_Rotate_List 
{
	
	public static Node rotate(Node head,int count)
	{
		Node tempHead = head;
		if(head == null || count <=0)
			return head;
		int i=0;
		
		while(i<count)
		{
			if(head == null) return head;
			head = head.next;
			i++;
		}		
		return null;
	}
	
	public static void main(String[] args)
	{
		Node n1 = new Node(100);
		Node n2 = new Node(90, n1);
		Node n3 = new Node(80, n2);
		Node n4 = new Node(70, n3);
		Node n5 = new Node(60, n4);
		
		Node.printFromTop(rotate(n5,2));
	}
}
