
package Khai_Bao_Lop_vaDoi_Tuong;

import java.util.Scanner;
public class J04008{
    static class point{
        double x,y;
        public void get(Scanner sc)
        {
            x=sc.nextDouble();
            y=sc.nextDouble();
        }
    }
    static double dis(point a,point b)
    {
        return Math.sqrt(Math.pow(a.x-b.x,2)+Math.pow(a.y-b.y,2));
    }
    static void cv(point m,point n,point k)
    {
        double a=dis(m,n);
        double b=dis(n,k);
        double c=dis(m,k);
        if(a+c==b||a+b==c||b+c==a||a==0||b==0||c==0) System.out.println("INVALID");
        else{
            double p=(a+b+c);
            System.out.printf("%.3f\n",p);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            point a = new point();
            point b = new point();
            point c = new point();
            a.get(sc);
            b.get(sc);
            c.get(sc);
            cv(a,b,c);
        }
    }
}
