
package Mang;
import java.util.Scanner;
public class J02014 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            t--;
            int n=sc.nextInt();
            int[] a =new int[100001];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(int i=1;i<n;i++)
            {
                a[i]+=a[i-1];
            }
            boolean ok=true;
            for(int i=1;i<n;i++)
            {
                if(a[n-1]-a[i]==a[i-1])
                {
                    System.out.println(i+1);
                    ok=false;
                    break;
                }
            }
            if(ok) System.out.println(-1);
        }
    }
}
