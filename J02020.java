
package Mang;
import java.util.Scanner;
public class J02020 {
   static boolean[] chuaxet=new boolean[1000];
   static int n;
   static int k;
   static int[] a=new int[1000];
   static int dem=0;
   static void In()
   {
       dem++;
       for(int i=1;i<=k;i++)
       {
           System.out.print(a[i]);
       }
       System.out.print(" ");
   }
   static void Try(int i)
   {
       for(int j=a[i-1]+1;j<=n;j++)
       {
           if(chuaxet[j]){
               chuaxet[j]=false;
               a[i]=j;
               if(i==k) In();
               else Try(i+1);
               chuaxet[j]=true;
           }
       }
   }
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       k=sc.nextInt();
       dem=0;
       for(int i=0;i<1000;i++) chuaxet[i]=true; Try(1);
       System.out.print("\n");
       System.out.printf("Tong cong co %d to hop\n",dem);
   }
}
