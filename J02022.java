
package Mang;
import java.util.Scanner;
public class J02022 {
    static int n;
    static int[] a=new int[1000];
    static boolean[] chuaxet=new boolean[1000];
    static void In()
    {
        boolean ok=true;
        for(int i=2;i<=n;i++)
        {
            if(Math.abs(a[i]-a[i-1])==1){
                ok=false;
                break;
            }
        }
        if(ok){
            for(int i=1;i<=n;i++)
            {
                System.out.print(a[i]);
            }
            System.out.println();
        }
    }
    static void Try(int i)
    {
        for(int j=1;j<=n;j++)
        {
            if(chuaxet[j])
            {
                a[i]=j;
                chuaxet[j]=false;
                if(i==n) In();
                else Try(i+1);
                chuaxet[j]=true;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            t--;
            n=sc.nextInt();
            for(int i=0;i<1000;i++) 
            {
                chuaxet[i]=true;
                a[i]=0;
            }
            Try(1);
        }
    }
}
