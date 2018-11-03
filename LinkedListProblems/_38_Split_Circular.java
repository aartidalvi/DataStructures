package karu_linkedlist;

public class _38_Split_Circular {
	static Node head1,head2;
	public static void SplitCircular(Node head)
	{
		Node slow_ptr = head;
		Node fast_ptr = head;

		if (head == null)
			return;

		while (fast_ptr.next != head && fast_ptr.next.next != head) {
			fast_ptr = fast_ptr.next.next;
			slow_ptr = slow_ptr.next;
		}
		
		if (fast_ptr.next.next == head) {
			fast_ptr = fast_ptr.next;
		}
		head1 = head;
		if (head.next != head) {
			head2 = slow_ptr.next;
		}
		fast_ptr.next = slow_ptr.next;
		slow_ptr.next = head;
		
		Node.printCircular(head1);
		Node.printCircular(head2);
	}

	public static void main(String[] args) {
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

		n1.next = n50;
		System.out.println("==========");
		Node.printCircular(n50);
		System.out.println("==========");
		SplitCircular(n50);

		// Node.printFromTop(reversePairRecursive(n50));
	}
}
