
package Mang;

import java.util.Scanner;
public class J02101 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0)
        {
            t-=1;
            int n =sc.nextInt();
            int[][] a= new int[101][101];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                 a[i][j]=sc.nextInt();   
                }
            }
            int j=0;
            for(int i=0;i<n;i++)
            {
                if(j==0)
                {
                    while(j<n)
                    {
                        System.out.printf("%d ",a[i][j]);
                        j++;
                    }
                }
                else if( j==n)
                {
                    while(j>0)
                    {
                        j--;
                        System.out.printf("%d ",a[i][j]);
                    }
                  
                }
            }
            System.out.println();
        }
    }
}
