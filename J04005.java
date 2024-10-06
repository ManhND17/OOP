
package Khai_Bao_Lop_vaDoi_Tuong;

import java.util.Scanner;
public class J04005 {
    static class Thisinh{
        String ten,ns;
        float x,y,z;
        public void get(Scanner sc)
        {
            ten=sc.nextLine();
            ns=sc.next();
            x=sc.nextFloat();
            y=sc.nextFloat();
            z=sc.nextFloat();
        }
    }
    static void In(Thisinh a)
    {
        System.out.printf("%s %s %.1f",a.ten,a.ns,a.x+a.y+a.z);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Thisinh a = new Thisinh();
        a.get(sc);
        In(a);
    }
}
