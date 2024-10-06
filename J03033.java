/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_tu;

import java.util.Scanner;
import java.math.BigInteger;
public class J03033 {
    static BigInteger GCD(BigInteger a,BigInteger b)
    {
        if(b.equals(BigInteger.ZERO))return a;
        else return GCD(b,a.mod(b));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            BigInteger a= sc.nextBigInteger();
            BigInteger b= sc.nextBigInteger();
            System.out.println(a.multiply(b).divide(GCD(a,b)));
        }
    }
}
