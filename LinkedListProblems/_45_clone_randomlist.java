package karu_linkedlist;

import java.util.HashMap;

class RandomNode
{
	int data;
	RandomNode next = null;
	RandomNode random = null;
	public RandomNode(int data, RandomNode next, RandomNode random) {
		super();
		this.data = data;
		this.next = next;
		this.random = random;
	}
}
public class _45_clone_randomlist 
{
	public static RandomNode randomCopy(RandomNode head1)
	{
		RandomNode temp1 = head1;
		HashMap<RandomNode,RandomNode> store = new HashMap<>();
		while(temp1 != null)
		{
			store.put(temp1, new RandomNode(temp1.data,null,null));
			temp1 = temp1.next;
		}		
		temp1 = head1;
		RandomNode temp2 = store.get(head1);
		
		while(temp1 != null)
		{
			temp2 = store.get(temp1);
			temp2.next = store.get(temp1.next);
			temp2.random = store.get(temp1.random);
			temp1 = temp1.next;
		}
		
		return store.get(head1);
	}
}
