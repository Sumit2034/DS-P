import java.util.*;
public class maxelement {
    
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
        int max=0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        System.out.println("maximum is "+max);
    }
}