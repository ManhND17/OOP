package JAVA_Co_Ban;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MyPC
 */
import java.util.Scanner;
public class J01007 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        long[] a=new long[93];
        a[0]=0;
        a[1]=1;
        a[2]=1;
        for(int i=3;i<=92;i++)
        {
            a[i]=a[i-1]+a[i-2];
        }
        while(t>0)
        {
            t--;
            int ok=1;
            long n=scanner.nextLong();
            for(int i=0;i<=92;i++)
            {
                if(n==a[i]){
                    System.out.printf("YES\n");
                    ok=0;
                    break;
                }
            }
            if(ok==1) System.out.printf("NO\n");
        }
    }
}
