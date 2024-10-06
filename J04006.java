/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Khai_Bao_Lop_vaDoi_Tuong;

import java.util.Scanner;
public class J04006 {
    static class Sinhvien{
        String ten,msv,lop,ns;
        float x;
        public void get(Scanner sc)
        {
            msv="B20DCCN001";
            ten=sc.nextLine();
            lop=sc.next();
            ns=sc.next();
            x=sc.nextFloat();
        }
    }
    static String chuanhoa(String s)
    {
        String[] w=s.split("/");
        for(int i=0;i<w.length;i++)
        {
            if(w[i].length()<2) w[i]="0"+w[i];
        }
        return w[0]+"/"+w[1]+"/"+w[2];
    }
    static void In(Sinhvien a)
    {
        a.ns=chuanhoa(a.ns);
        System.out.printf("%s %s %s %s %.2f",a.msv,a.ten,a.lop,a.ns,a.x);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Sinhvien a = new Sinhvien();
        a.get(sc);
        In(a);
    }
}
