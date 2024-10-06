
package Khai_Bao_Lop_vaDoi_Tuong;
import java.util.*;
public class J04018 {
    static class SoPhuc{
        int x,y;
        public void get(Scanner sc)
        {
            x=sc.nextInt();
            y=sc.nextInt();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0)
        {
            SoPhuc a = new SoPhuc(); a.get(sc);
            SoPhuc b = new SoPhuc(); b.get(sc);
            SoPhuc e = new SoPhuc();
            e.x=a.x+b.x; e.y=a.y+b.y;
            SoPhuc c = new SoPhuc();
            c.x = e.x*a.x - e.y*a.y;
            c.y= e.x*a.y+a.x*e.y;
            SoPhuc d = new SoPhuc();
            d.x = e.x*e.x - e.y*e.y;
            d.y= 2*e.x*e.y;
            if(d.y>0&&c.y>0)
            System.out.printf("%d + %di, %d + %di\n",c.x,c.y,d.x,d.y);
            else if(d.y>0&&c.y<0)
            {    
                c.y *=-1;
                System.out.printf("%d - %di, %d + %di\n",c.x,c.y,d.x,d.y);
            }
            else if(d.y<0 &&c.y>0)
            {
                d.y*=-1;
                System.out.printf("%d + %di, %d - %di\n",c.x,c.y,d.x,d.y);
            }
            else{
                c.y*=-1;
                d.y*=-1;
                      
                System.out.printf("%d - %di, %d - %di\n",c.x,c.y,d.x,d.y);
            }
                
                       
        }
    }       
}
