package main;

class Qnode
{
	int key;
	Qnode next;
	
	public Qnode(int item)
	{
		key = item;
		next = null;
	}
}
public class Q_as_linkelist {

	Qnode front,rear;
	
	Q_as_linkelist()
	{
		front = rear = null;
	}
	
	void EnQ(int data)
	{
		Qnode newnode = new Qnode(data);
		
		if(rear == null)
		{
			 front = rear = newnode;
		}
		
		rear.next = newnode;
		rear = newnode;
	}
	void dQ()
	{
		if(front == null)
		{
			return;
		}
		
		Qnode temp = front;
		front = front.next;
		if(front == rear)
		{
			rear = null;
		}
	}
	public static void main(String[] args)
	{
		Q_as_linkelist queue = new Q_as_linkelist();
		
		queue.EnQ(10);
		queue.EnQ(20);
		queue.EnQ(30);
		queue.EnQ(40);
		queue.EnQ(50);
		
		queue.dQ();
		queue.dQ();
		queue.dQ();
		
		queue.EnQ(60);
		
		System.out.println("queue Front element: " + queue.front.key);
		System.out.println("queue rear element: " + queue.rear.key);
		
		
	}
}
