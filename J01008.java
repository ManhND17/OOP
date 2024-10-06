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
public class J01008 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        for(int i=1;i<=t;i++)
        {
            long n=scanner.nextLong();
            System.out.printf("Test %d: ",i);
            int dem=0;
            if(n%2==0)
            {
                while(n%2==0)
                {
                    dem++;
                    n/=2;
                }
                System.out.printf("2(%d) ",dem);
            }
            long x=3;
            while(n>1)
            {
                if(n%x==0)
                {
                    dem=0;
                    while(n%x==0)
                    {
                        dem++;
                        n/=x;
                    }
                    System.out.printf(" %d(%d)",x,dem);
                }
                else x+=2;
            }
            System.out.println();
        }
    }
}
