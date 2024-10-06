/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Khai_Bao_Lop_vaDoi_Tuong;

import java.util.Scanner;
public class J04002 {
    static class Rectange{
        int x,y;
        String c;
        public void get(Scanner sc)
        {
            x=sc.nextInt();
            y=sc.nextInt();
            c=sc.next();
        }
    }
    static void In(Rectange a)
    {
        a.c = a.c.toLowerCase();
        String s= a.c.substring(0,1).toUpperCase();
        String b=a.c.substring(1,a.c.length());
        a.c = s+b;
        if(a.x>0&&a.y>0)
            System.out.printf("%d %d %s\n",a.x*2+a.y*2,a.y*a.x,a.c);
        else System.out.println("INVALID");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Rectange a = new Rectange();
        a.get(sc);
        In(a);
    }
}
