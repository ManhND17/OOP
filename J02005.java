package Mang;



import java.util.Scanner;
public class J02005 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); int m=sc.nextInt();
        int[] f=new int[1000];
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            f[x]=1;
        }
        for(int i=0;i<m;i++)
        {
            int x=sc.nextInt();
            if(f[x]==1) f[x]=2;
        }
        for(int i=0;i<1000;i++)
        {
            if(f[i]==2) System.out.printf("%d ",i);
        }
    }
}
