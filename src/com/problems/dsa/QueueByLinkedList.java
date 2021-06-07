package com.problems.dsa;

import com.problems.dsa.QueueByLinkedList.Node;

public class QueueByLinkedList {
	private Node front,rear;
	public int size;
	class Node
	{
		public int data;
		public Node next;
		
	}
	
	
	public QueueByLinkedList() {
	
		 front = null;
		 rear =null;
		 size= 0;
	}

	public boolean isEmpty()
	{
		return(size==0);
	}
	
	public int deQueue()
	{
		int data = front.data;
		front = front.next;
		if (isEmpty()) 
		 {
		 rear = null;
		 }
		size--;
		System.out.println(data+ " removed from the queue");
		return data;
	}
	
	public void enQueue(int data)
	{
		Node Rrear = rear;
		rear = new Node();
		rear.data = data;
		rear.next=null;
				if (isEmpty()) 
				 {
				 front = rear;
				 }
				 else 
				 {
				 Rrear.next = rear;
				 }
				 size++;
				 System.out.println(data);
	}
	
	

	public static void main(String[] args) {
		QueueByLinkedList q = new QueueByLinkedList();
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		q.enQueue(50);
		q.deQueue();
		
	}

}
