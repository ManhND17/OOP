/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Khai_Bao_Lop_vaDoi_Tuong;

import java.util.Scanner;
public class J04007 {
    static class Nhanvien{
        String ten,se,ns,dc,mst,day;
        public void get(Scanner sc)
        {
            ten=sc.nextLine();
            se=sc.nextLine();
            ns=sc.nextLine();
            dc=sc.nextLine();
            mst=sc.nextLine();
            day=sc.nextLine();
        }
    }
    static void In(Nhanvien a)
    {
        System.out.printf("00001 %s %s %s %s %s %s",a.ten,a.se,a.ns,a.dc,a.mst,a.day);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Nhanvien a = new Nhanvien();
        a.get(sc);
        In(a);
    }
}
