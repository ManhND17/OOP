/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Khai_Bao_Lop_vaDoi_Tuong;

import java.util.Scanner;
public class J04004 {
    static class Phanso{
        long x,y;
        public void get(Scanner sc)
        {
            x=sc.nextLong();
            y=sc.nextLong();
        }
    }
    static long UCLN(long a,long b)
    {
        if(b==0) return a;
        return UCLN(b,a%b);
    }
    static void Union(Phanso a,Phanso b)
    {
        long k=a.x*b.y + b.x*a.y;
        long u=UCLN(k,a.y*b.y);
        System.out.printf("%d/%d",k/u,(a.y*b.y)/u);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Phanso a = new Phanso();
        Phanso b = new Phanso();
        a.get(sc);
        b.get(sc);
        Union(a,b);
    }
}
