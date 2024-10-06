
package Mang;
import java.util.Scanner;
public class J02013 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[101];
        for(int i=1;i<=n;i++)
        {
            a[i]=sc.nextInt();
        }
        for (int i =1;i<=n;i++)
        {
            
            int cnt=0;
            for(int j=1;j<=n;j++)
            {
                if(a[j]<a[j-1]){
                    cnt++;
                    int c=a[j];
                    a[j]=a[j-1];
                    a[j-1]=c;
                }
            }
            if(cnt==0) break;
            else
            {
                System.out.printf("Buoc %d:",i);
                for(int j=1;j<=n;j++)
                {
                    System.out.printf(" %d",a[j]);
                }
                System.out.println();
            }
        }
    }
}
