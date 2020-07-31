import java.util.*;
public class Insertionaftercertainnode {
	Node head; 
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insertionaftercertainnode ll = new Insertionaftercertainnode();
		Scanner scan = new Scanner(System.in);
		int n=0;
		System.out.println("enter element in linke list and to stop press -1");
		while(n!=-1)
		{
			n = scan.nextInt();
			ll.append(n);
		}
		System.out.println("enter element to insert and position");
		int ele = scan.nextInt();
		int pos = scan.nextInt();
		scan.close(); 
		ll.insertatposition(ele,pos);
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
	public void insertatposition(int element,int position)
	{
		Node newnode2 = new Node(element);
		Node temp = head;
			while(position-1>0)
			{
				temp = temp.next;
				position = position - 1;
			}
			newnode2.next = temp.next;
			temp.next = newnode2;
			
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
