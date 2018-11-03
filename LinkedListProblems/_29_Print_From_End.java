package karu_linkedlist;

public class _29_Print_From_End 
{
	
	public static void printReverse(Node node)
	{
		if(node.next!=null) {
			printReverse(node.next);
		}
		System.out.print("\t" + node.data);
	}
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2,n1);
		Node n3 = new Node(3,n2);
		Node n4 = new Node(4,n3);
		Node n5 = new Node(5,n4);
		
		printReverse(n5);
	}
}
