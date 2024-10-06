package JAVA_Co_Ban;


import java.util.Scanner;
public class J01025 {
    static int min(int a,int b,int c,int d)
    {
        return Math.min(Math.min(Math.min(a, b),c),d);
    }
     static int max(int a,int b,int c,int d)
    {
        return Math.max(Math.max(Math.max(a, b),c),d);
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int ax=sc.nextInt(); int ay=sc.nextInt();
        int bx=sc.nextInt(); int by=sc.nextInt();
        int cx=sc.nextInt(); int cy=sc.nextInt();
        int dx=sc.nextInt(); int dy=sc.nextInt();
        int x=min(ax,bx,cx,dx); int z=max(ax,dx,bx,cx);
        int y=min(ay,by,cy,dy); int k=min(ay,by,cy,dy);
        int c=Math.max(z-x, y-k);
        System.out.println(c*c);
    }
}
