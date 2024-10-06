
package Mang;

import java.util.Scanner;
public class J02103 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int cnt=1;
        while(t>0)
        {
            t-=1;
            System.out.printf("Test %d:\n",cnt);
            cnt++;
            int n= sc.nextInt();
            int m=sc.nextInt();
            int[][] a=new int[n+1][m+1];
            int[][] b=new int [m+1][n+1];
            int[][] c=new int [n+1][n+1];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    a[i][j]=sc.nextInt();
                    b[j][i]=a[i][j];
                }
            }
            for(int k=0;k<n;k++)
            {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    c[k][i]+=a[k][j]*b[j][i];
                }
            }
            }
            for(int i=0;i<n;i++)
            {
                for (int j=0;j<n;j++)
                {
                    System.out.printf("%d ",c[i][j]);
                }
                System.out.println();
            }
        }
    }
}
