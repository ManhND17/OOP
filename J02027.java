
package Mang;

import java.util.*;
public class J02027 {
    static int tknp(int[] a,int l,int r,int x)
    {
       if(l>r) return l;
       int mid= (l+r)/2;
       if(a[mid]>x) return tknp(a,l,mid-1,x);
       return tknp(a,mid+1,r,x);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++) a[i]= sc.nextInt();
            for(int i=0;i<n;i++)
            {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int c =a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }
            }
            long sum=0;
            for(int i=1;i<n;i++)
            {
                int x =tknp(a,0,i-1,a[i]-k);
                sum+=(long)(i-x);
            }
            System.out.println(sum);
        }
        
    }
}
