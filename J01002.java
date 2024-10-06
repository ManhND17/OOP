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
public class J01002 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t>0)
        {
            t--;
            long n = scanner.nextLong();
            long  s=(n*(n+1))/2;
            System.out.println(s);
        }
        scanner.close();
    }
}
