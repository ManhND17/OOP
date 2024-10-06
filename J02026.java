
package Mang;
import java.util.*;
public class J02026 {
    static void Try(int[] a,int cnt,int k,int num,String s)
    {
        if(cnt==k)
        {
            System.out.println(s);
        }
        for(int i=num;i<a.length;i++)
        {
            Try(a,cnt+1,k,i+1,s+a[i]+' ');
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] b = new int[n];
            for(int i=0;i<n;i++)
            {
                b[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(b[i]>b[j])
                    {
                        int c = b[i];
                        b[i] = b[j];
                        b[j] = c;
                    }
                }
            }
            Try(b,0,k,0,"");
        }
    }
}
