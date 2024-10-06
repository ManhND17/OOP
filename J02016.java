
package Mang;

import java.util.Scanner;
import java.util.Arrays;
public class J02016 {
    static boolean check(long[] a)
    {
        for (int i=a.length-1;i>=2;i--)
        {
            int j = 0, k= i-1;
            while(j<k)
            {
                long x=a[j]+a[k];
                if(x==a[i]) return true;
                else if(x>a[i]) k--;
                else j++;
            }
        }
        return false;
    }
        
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
                a[i]*=a[i];
            }
            Arrays.sort(a);
           
            if(check(a)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
        
}
