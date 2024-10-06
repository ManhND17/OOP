
package Mang;

import java.util.Scanner;
public class J02034 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[101];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        if(n==a[n-1]) System.out.print("Excellent!\n");
        else{
            if(a[0]!=1)
            {
                for(int i=1;i<a[0];i++)
                {
                    System.out.println(i);
                }
            }
            for(int i=1;i<n;i++)
            {
                if(a[i]-a[i-1]!=1){
                    for(int j=a[i-1]+1;j<a[i];j++)
                    {
                        System.out.println(j);
                    }
                }
            }
        }
    }
}
