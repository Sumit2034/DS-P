import java.util.*;
public class optimizebubblesort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new  int[n];
        boolean swap = false;
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }
        scan.close();
        int temp = 0;
        for(int i=0;i<n;i++)
        {
            swap = false;
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    swap = true;
                }
            }
            if(swap == false)
            {
                break;
            }
        }
        System.out.println("\n");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}