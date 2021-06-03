package Array;

public class QueueExample {
	
	int[] queue = new int[5];
	int size;
	int front;
	int rear;
	
	public void enQueue(int data)
	{
		queue[rear] = data;
		rear = rear + 1 ;
		size = size + 1;
	}
	
	public int deQueue()
	{
		int data = queue[front];
		front = front +1;
		size = size - 1;
		return data;
	} 
	
	public void show()
	{
		for(int i =0 ;i<size;i++)
		{
			System.out.println(queue[i]);
		}
	}

	public static void main(String[] args)
	{
		QueueExample q = new QueueExample();
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		q.enQueue(50);
		
		q.deQueue();
		q.show();
	}
}
