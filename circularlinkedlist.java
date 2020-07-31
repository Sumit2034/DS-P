import java.util.*;
public class circularlinkedlist
{
    Node head=null;
    Node tail=null;
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    circularlinkedlist cll = new circularlinkedlist();
	    int n=0;
	    while(n!=-1)
	    {
	        n = scan.nextInt();
	        cll.insertionatbegin(n);
	    }
	    System.out.println("Circular linked list is:"+"\n");
	    scan.close();
	    cll.print();
	}
	static class Node
	{
	    Node next;
	    int data;
	    Node(int ele)
	    {
	        data = ele;
	        next = null;
	    }
	}
	public void insertionatbegin(int item)
	{
	    Node newnode = new Node(item);
	    if(head==null)
	    {
	       newnode.next = head;
	       head = newnode;
	       tail = newnode;
	    }
	   
	    else
	    {   
	       
	        tail.next = newnode;
	        tail = newnode;                 // insertion at end
	        tail.next = head;
	        /*{newnode.next = temp;
	        	head = newnode;
	          	Node temp = head;                 insertion at beginning
	        	tail.next = head;
	        }*/
	    }
	}
	public void print()
	{
	    Node dup = head;
	    do{
	        System.out.println(dup.data+"  ");
	        dup = dup.next;
	    }while(dup!=head);
	}
}
