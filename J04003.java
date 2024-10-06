/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Khai_Bao_Lop_vaDoi_Tuong;
import java.util.Scanner;
public class J04003 {
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
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Phanso a = new Phanso();
        a.get(sc);
        long s=UCLN(a.x,a.y);
        System.out.printf("%d/%d",a.x/s,a.y/s);
    }
}
