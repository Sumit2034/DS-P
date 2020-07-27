import java.util.*;
public class LinkedList {
	Node head; 
	      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		Scanner scan = new Scanner(System.in);
		int n=0;
		while(n!=-1)
		{
			n = scan.nextInt();
			ll.append(n);
		}
		scan.close(); 
		ll.print();
	}
	static class Node
	{
		int data;
		Node next;
		
		Node(int ele)
		{
			data = ele;
			next = null;
		}
	}
	public void append(int newdata)
	{
		Node newnode = new Node(newdata);
		if(head == null)
		{
			head = new Node(newdata);
			return;
		}
		newnode.next = null;
		
		Node last = head;
		while(last.next!=null)
		{
			last = last.next;
		}
		last.next = newnode;
	}
	void print()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.println(" "+temp.data);
			temp = temp.next;
		}
		return;
	}
	
}
