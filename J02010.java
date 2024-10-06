
package Mang;
import java.util.Scanner;
public class J02010 {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] a=new int[101];
       for(int i=1;i<=n;i++)
       {
           a[i]=sc.nextInt();
       }
       for(int i=1;i<=n-1;i++)
       {
           for(int j=i+1;j<=n;j++)
           {
               if(a[i]>a[j]){
                   int c=a[i];
                   a[i]=a[j];
                   a[j]=c;
               }
           }
           System.out.printf("Buoc %d: ",i);
           for(int j=1;j<=n;j++)
           {
               System.out.printf("%d ",a[j]);
           }
           System.out.print("\n");
       }
 }
}