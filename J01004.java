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
public class J01004 {
   public static void main(String[] args)
   {
       Scanner scanner = new Scanner (System.in);
       int t = scanner.nextInt();
       while(t>0)
       {
           t--;
           long x=scanner.nextLong();
           if(Check(x)) System.out.println("YES");
           else System.out.println("NO");
       }
   }
   public static boolean Check (long a)
   {
       for(int i=2;i<=Math.sqrt(a);i++)
       {
           if(a%i==0) return false;
       }
       return true;
   }
}
