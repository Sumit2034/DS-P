import java.util.*;
public class binarysearch{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter array size");
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        int first,mid,last;
        first = 0;
        last = n-1;
        mid = n/2;
        System.out.println("enter no. u want to search");
        int num = scan.nextInt();
        scan.close();
        while(first<=last)
        {
            if(arr[mid]>num)
            {
                last = mid-1;
            }
            else if(arr[mid]==num)
            {
                System.out.printf("index = %d       Value = %d",mid,arr[mid]);
                break;
            }
            else if(arr[mid]<num)
            {
                first = mid+1;
            }
            mid = (first+last)/2;
        }
    }
}