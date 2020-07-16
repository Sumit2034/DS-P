import java.util.*;
public class sortwithoutbubblesort {
    public static void main(String[] args) 
    {   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }
        scan.close();
        Arrays.sort(a);
        // Prints each sequential element in array a
        System.out.println("\n");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}