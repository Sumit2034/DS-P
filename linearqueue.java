package main;

public class linearqueue {
		public static class QueueA {
			
			private int front=-1;
			private int rear=-1;
			private int size;
			private int a[];

			public QueueA(int n)
			{
				a=new int[n];
				size=n;
			}
			
			void enq(int n)
			{
				
				if(rear==size-1)
				{
					System.out.println("full");
					return;
				}
				
				if(front==-1)
				{
					front=0;
				}
				
				rear++;
				
				a[rear]=n;
			}
			
			void deq()
			{
				if(empty())
				{
					System.out.println("empty");
					return;
				}
				
				System.out.println(a[front]+" deleted");
				front++;
			}
			
			boolean empty()
			{
				return (front==rear+1);
			}
			
			int size()
			{
				return(rear-front+1);
			}
			
			int front()
			{
				return a[front];
			}
			
			int rear()
			{
				return a[rear];
			}
		}


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			QueueA q=new QueueA(5);
			q.enq(1);
			q.enq(2);
			q.enq(3);
			q.enq(4);
			q.enq(5);
			q.enq(6);
			System.out.println("last ele: "+q.rear());
			System.out.println("fist ele: "+q.front());
			System.out.println("size: "+q.size());
			q.deq();
			q.deq();
			q.deq();
			System.out.println("last ele: "+q.rear());
			System.out.println("fist ele: "+q.front());
			System.out.println("size: "+q.size());
			q.deq();
			q.deq();
			q.deq();
			System.out.println("size: "+q.size());

			}

}