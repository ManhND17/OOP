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
public class J01005 {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        int t=scanner.nextInt();
        while(t>0)
        {
            t--;
            double n=scanner.nextDouble();
            double h=scanner.nextDouble();
            for(double i=1;i<n;i++)
            {
                double x= i/n;
                double y=Math.sqrt(x)*h;
                System.out.printf("%.6f ",y);
            }
            System.out.println();
        }
    }
}