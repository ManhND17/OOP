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
public class J01012 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t>0)
        {
            t--;
            long n=scanner.nextLong();
            long dem=0;
            for(int i=1;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    if(i%2==0) dem++;
                    if((n/i)%2==0) dem++;
                    if(i==n/i&&i%2==0) dem--;
                }
            }
            System.out.println(dem);
            
        }
    }
}
