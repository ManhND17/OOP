
package Mang;
import java.util.Scanner;
import java.util.ArrayList;
public class J02009 {
    static class pair{
        public int x,y;
        public pair(int a,int b)
        {
            x = a;
            y = b;
        }
            
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<pair> a = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            a.add(new pair(sc.nextInt(),sc.nextInt()));
        }
        a.sort((pair c, pair b)->
        {
            return c.x - b.x;
        });
        int tong = 0;
        for(int i=0;i<n;i++)
        {
            if(a.get(i).x>=tong) tong=a.get(i).x;
            tong = tong+a.get(i).y;
        }
        System.out.println(tong);
    }
}
