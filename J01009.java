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
public class J01009 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        long s=1;
        long x=1;
        for(int i=2;i<=n;i++)
        {
            x=x*i;
            s=s+x;
        }
        System.out.print(s);
    }
}
