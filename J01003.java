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
public class J01003 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        if(a==0&&b==0) System.out.println("VSN");
        else if(a==0&&b!=0) System.out.println("VN");
        else{
            float x=-b/a;
            System.out.format("%.2f\n",x);
        }
        scanner.close();
    }
}
