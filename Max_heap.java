package main;
//import java.util.*;
public class Max_heap {

	public int heap_arr[];
	public int size;
	public int maxsize;
	
	public Max_heap(int maxsize)
	{
		this.maxsize = maxsize;
		this.size = 0;
		heap_arr = new int[this.maxsize + 1];
		heap_arr[0] = Integer.MAX_VALUE;
	}
	private int leftchild(int pos)
	{
		return (pos*2);
	}
	private int rightchild(int pos)
	{
		return (pos*2) + 1;
	}
	private void heapify(int position)
	{
		if(!isleaf(position))
		{
			if((heap_arr[position]< heap_arr[leftchild(position)]) || (heap_arr[position]< heap_arr[rightchild(position)]))
			{
				if(heap_arr[leftchild(position)]>heap_arr[rightchild(position)])
				{
					swap(position,leftchild(position));
					heapify(leftchild(position));
				}
				else if(heap_arr[leftchild(position)]<heap_arr[rightchild(position)])
				{
					swap(position,rightchild(position));
					heapify(rightchild(position));
				}
			}
		}
		else
		return;
	}
	private int parent(int pos)
	{
		return pos/2;
	}
	private void swap(int currentpos, int parentpos)
	{
		int temp;
		temp = heap_arr[currentpos];
		heap_arr[currentpos] = heap_arr[parentpos];
		heap_arr[parentpos] = temp;
	}
	private void insert(int element)
	{
		heap_arr[++size] = element;
		
		int current = size;
		
		while(heap_arr[current] > heap_arr[parent(current)])
		{
			swap(current,parent(current));
			current = parent(current);
		}
	}
	private void printheap_arr()
	{
		for(int i=1;i<size/2;i++)
		{
			System.out.println("Parent node:" + heap_arr[i] + " Left Child: " + heap_arr[2*i] + " Right Child: " + heap_arr[2*i+1]);
		}
	}
	private int  remove()
	{
		int popped = heap_arr[1];
		heap_arr[1] = heap_arr[size--];
		heapify(1);
		return popped;
	}
	boolean isleaf(int pos)
	{
		if(pos >= size/2 && pos<=size)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args)
	{
		Max_heap heap = new Max_heap(15);
		
		
		heap.insert(10);
		heap.insert(30);
		heap.insert(3);
		heap.insert(9);
		heap.insert(87);
		heap.insert(1);
		heap.insert(5);
		heap.insert(76);
		heap.insert(21);
		
		
		heap.printheap_arr();

		int pop = heap.remove();
		System.out.println("\nelement remove from heap is :\n" + pop);
		
		System.out.println("heap after removing element \n");
		heap.printheap_arr();
	}
}
