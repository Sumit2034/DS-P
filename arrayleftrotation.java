import java.util.*;
public class arrayleftrotation {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter array size");
        int n = scan.nextInt();
        int a[] = new int[n];
        System.out.println("enter no. of rotation");
        int rotation = scan.nextInt();
        System.out.println("enter array data");
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }
        scan.close();
        int dup = 0;
        for(int i=0;i<rotation;i++)
        {
            dup = a[0];
            for(int j=0;j<n-1;j++)
            {
                a[j] = a[j+1];
            }
            a[n-1] = dup;
        }
        System.out.println("\n");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}