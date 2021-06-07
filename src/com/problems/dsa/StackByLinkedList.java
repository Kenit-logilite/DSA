package Array;
public class StackByLinkedList {
	
	class Node
	{
		public int data;
		public Node next;
	}
	
	private Node first;

	public StackByLinkedList() {
		
		first = null;
	}
		
	public void push(int a)
	{
		Node n = new Node();
		n.data = a;
		n.next = first;
		first = n;
	}
	
	public int peek()
	{
		if (first==null)
		{
			System.out.println("No Element");
		}
		else
		{
			int ret = first.data;
			return ret;
		}
		return 0;
	
	}
	public int pop()
	{
		if (first == null)
		{
			System.out.println("No such element");
		}
		else
		{
			Node temp = first;
			first = first.next;
			return temp.data;
		}
		return 0;
	}
	
	public static void main(String[] args)
	{
		
		StackByLinkedList s1 = new StackByLinkedList();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		
	
		System.out.println(s1.peek());
		System.out.print("\nFirst pop: " + s1.pop() + "\nSecond pop: " + s1.pop() + "\nThird pop: " + s1.pop());
		System.out.print("\n");
		
	}
	
	

}
