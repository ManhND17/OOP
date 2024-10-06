
package Mang;
import java.util.Scanner;
public class J02007 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int d=0;
        while(t>0)
        {
            t--;
            d++;
            
            int n=sc.nextInt();
            int[] a=new int[101];
            int[] f=new int[100001];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                f[a[i]]++;
            }
             System.out.printf("Test %d:\n",d);
            for(int i=0;i<n;i++)
            {
                if(f[a[i]]>0)
                {
                    System.out.printf("%d xuat hien %d lan\n",a[i],f[a[i]]);
                    f[a[i]]=0;
                }
            }
        }
    }
}
