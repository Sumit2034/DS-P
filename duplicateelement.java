import java.util.*;
public class duplicateelement {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();// Scanned element value should be less than size of array 
        }
        scan.close();
        duplicateelement dup = new duplicateelement();
        int arrsize = a.length;
        dup.printrepeating(arrsize,a);
    }
    void printrepeating(int size, int a[])
    {
        System.out.println("Repeating elements are:");
        for(int i=0;i<size;i++)
        {
            if(a[Math.abs(a[i])]>=0)
            {
                a[Math.abs(a[i])] = -a[Math.abs(a[i])];
            }
            else
            {
                System.out.println(Math.abs(a[i])+" ");
            }
        }
    }
    
}