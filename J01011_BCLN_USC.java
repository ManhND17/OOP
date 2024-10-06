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
public class J01011_BCLN_USC {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t>0)
        {
            t--;
            long a=scanner.nextLong();
            long b=scanner.nextLong();
            long c=(long) a*b/UCLN(a,b);
            System.out.printf("%d %d",c,UCLN(a,b));
            System.out.println();
        }
    }
    public static long UCLN(long a,long b)
    {
        while(b!=0)
        {
            long c=a;
            a=b;
            b=c%b;
        }
        return a;
    }
}
