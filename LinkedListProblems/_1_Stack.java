package karu_linkedlist;

public class _1_Stack 
{
	Node top = null;
	
	public void push(int data)
	{
		if(top == null)
			top = new Node(data,null);
		else
			top = new Node(data,top);
	}
	
	public int pop()
	{
		if(top == null)
			return -1;
		else
		{
			Node pop = top;
			top = top.next;
			return pop.data;
		}
	}
	
	public void printStack()
	{
		Node temp = top;
		while(temp!=null)
		{
			System.out.print(temp.data + "\t");
			temp = temp.next;
		}
		System.out.println("done");
	}
	public static void main(String[] args) 
	{
		_1_Stack s = new _1_Stack();
		System.out.println(s.pop());
		s.push(1);
		s.push(2);
		s.push(3);
		s.printStack();
		System.out.println(s.pop());
		s.printStack();
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.printStack();
	}
}
