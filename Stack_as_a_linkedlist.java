package main;

public class Stack_as_a_linkedlist {

	stacknode root = null;
	static class stacknode
	{
		stacknode next;
		int data;
		
		stacknode(int item)
		{
			data = item;
		}
	}
	void push(int data)
	{
		stacknode newnode = new stacknode(data);
		
		if(root == null)
		{
			root = newnode;
		}
		else
		{
			stacknode temp = root;
			root = newnode;
			newnode.next = temp;
		}
		System.out.println(data + "  pushed to stack");
	}
	int popped()
	{
		int popped = Integer.MIN_VALUE;
		if(root == null)
		{
			System.out.println("stack is empty");
		}
		else
		{
			popped = root.data;
			
			root = root.next;
		}
		return popped;
	}
	int peek()
	{
		if(root == null)
		{
			System.out.println("stack is empty");
			return Integer.MIN_VALUE;
		}
		else
		{
			return root.data;
		}
	}
	public static void main(String[] args)
	{
		Stack_as_a_linkedlist stack = new Stack_as_a_linkedlist();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		int pop = stack.popped();
		System.out.println("popped element is: " + pop);
		
		
		System.out.println("peeked element: " + stack.peek());
	}
	
}
