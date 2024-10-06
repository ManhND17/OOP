
package Mang;
import java.util.*;
public class J02025 {
    static ArrayList<String> ans;
    static boolean check(int n)
    {
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
    static void Try(int[] a,int end,int tong,String s)
    {
        if(check(tong))
        {
            System.out.println(s);
            ans.add(s);
        }
        for(int i=a.length-1;i>end;i--)
        {
            Try(a,i,tong+a[i],s+a[i]+' ');
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            ans = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(a[i]<a[j])
                    {
                        int c = a[i];
                        a[i] = a[j];
                        a[j] = c;
                    }
                }
            }
            Try(a,-1,0,"");
        }
            
    }
}
