package main;

public class Heap_sort {
	
	public static void main(String[] args)
	{
		int arr[] = new int[] {22,13,17,11,10,14,12};
		
		Heap_sort hs = new Heap_sort();
		
		hs.sort(arr);
		System.out.println("After sorting:");
		hs.print(arr);
	}
	void sort(int heap[])
	{
		int length = heap.length;
		
		for(int i=0;i<=length/2-1;i++)
		{
			heapify(heap,length,0);
		}
		for(int i=length-1; i>=0; i--)
		{
				int temp = heap[0];
				heap[0] = heap[i];
				heap[i] = temp;
				
				heapify(heap, i, 0);
		}
	}
	void heapify(int heap[], int n, int i)
	{
		int largest = i;
		int leftchild = 2*i+1;
		int rightchild = 2*i+2;
		
		if(leftchild < n && heap[leftchild]>heap[largest])
		{
			largest = leftchild;
		}
		if(rightchild < n && heap[rightchild]>heap[largest])
		{
			largest = rightchild;
		}
		
		if(largest != i)
		{
			int temp = heap[i];
			heap[i] = heap[largest];
			heap[largest] = temp;
			
			heapify(heap, n, largest);
		}
	}
	void print(int heapsort[])
	{
		for(int i=0;i<heapsort.length;i++)
		{
			System.out.println(heapsort[i]);
		}
	}
}
