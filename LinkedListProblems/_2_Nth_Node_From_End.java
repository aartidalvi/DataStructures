package karu_linkedlist;

public class _2_Nth_Node_From_End 
{
	public static int NthNode(Node root,int n)
	{
		Node temp = root;
		Node result = root;
		for(int i=0;i<n;i++)
		{
			if(temp == null)
				return -1;
			temp = temp.next;
		}
		while(temp!=null)
		{
			temp = temp.next;
			result = result.next;
		}
		
		return result == null ? -1 : result.data;
	}
	public static void main(String[] args) 
	{
		Node n1 = new Node(1);
		Node n2 = new Node(2,n1);
		Node n3 = new Node(3,n2);
		Node n4 = new Node(4,n3);
		Node n5 = new Node(5,n4);
		
		System.out.println(NthNode(n5, 5));
		System.out.println(NthNode(n1, 3));
	}
}
