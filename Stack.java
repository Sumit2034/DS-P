import java.util.*;
public class Stack {
	int top = -1;
	static int n = 5;
	int arrstack[] = new int[n];
	public static void main(String[] args)
	{
		Stack stack = new Stack();
		Scanner scan = new Scanner(System.in);
		System.out.println("press -1 to end the loop");
		int ele = 0; 
		while(ele!=-1)
		{
			ele = scan.nextInt();
			stack.push(ele);
		}
		System.out.println("after push:");
		stack.Display();
		System.out.println("how many ele you want to delete");
		int del = scan.nextInt();
		for(int i=0;i<del;i++)
		{
			stack.pop();
		}
	}
	public boolean push(int data)
	{
		if(top==n-1)
		{
			System.out.println("Stack overflow");
			return false;
		}
		else
		{
			arrstack[++top] = data;
			return true;
		}
	}
	public boolean pop()
	{
		if(top==-1)
		{
			System.out.println("Stack underflow");
			return false;
		}
		else
		{
			System.out.println("after pop:"+ (top+1));
			top--;
			return true;
		}
		
	}
	void Display()
	{
		for(int i=0;i<=top;i++)
		System.out.println(arrstack[i]);
	}
}
