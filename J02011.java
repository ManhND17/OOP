
package Mang;

import java.util.Scanner;
public class J02011 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[101];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            int x=101;
            int y=0;
            for(int j=i+1;j<n;j++)
            {
                if(x>a[j])
                {
                    y=j;
                    x=a[j];
                }
            }
            if(a[i]>a[y])
            {
                a[y]=a[i];
                a[i]=x;
            }
            System.out.printf("Buoc %d: ",i+1);
            for(int j=0;j<n;j++)
            {
                System.out.printf("%d ",a[j]);
            }
            System.out.println();
        }
    }
}
