
package Mang;
import java.util.Scanner;
public class J02106 {
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] a=new int[4];
        int dem=0;
        for(int i=1;i<=n;i++)
        {
            int x=0;
            for(int j=1;j<=3;j++)
            {
                a[j]=sc.nextInt();
                if(a[j]==1) x++;
            }
            if(x>=2) dem++;
        }
        System.out.println(dem);
    }
}
