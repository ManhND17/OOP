
package Mang;

import java.util.Scanner;
public class J02105 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] a=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            System.out.printf("List(%d) = ",i);
            for(int j=1;j<=n;j++)
            {
                a[j]=sc.nextInt();
                if(a[j]==1) System.out.printf("%d ",j);
            }
             System.out.println();
        }
        
    }
}
