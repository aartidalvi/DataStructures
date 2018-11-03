//Check check check
package karu_linkedlist;

public class _6_Nth_Node_From_End_Recursion
{
	static int cnt;
	public static int NthRecursion(Node node, int index)
	{
		Node result = findNth(node,index);
		return ((result == null) ? -1 : result.data);
	}
	public static Node findNth(Node node,int index)
	{
		if(node != null)
		{
			findNth(node.next, index);
			cnt++;
			if(index == cnt)
				return node;
		}
		return null;
	}
	
	public static void main(String[] args) 
	{
		Node n1 = new Node(1);
		Node n2 = new Node(2,n1);
		Node n3 = new Node(3,n2);
		Node n4 = new Node(4,n3);
		Node n5 = new Node(5,n4);
		
		System.out.println(NthRecursion(n5, 3));
		System.out.println(NthRecursion(n1, 3));
	}
}
