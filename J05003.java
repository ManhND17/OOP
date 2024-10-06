
package Mang_Doi_Tuong;

import java.util.Scanner;
public class J05003 {
    static class Thoigian{
        int x,y,z;
        public void get(Scanner sc)
        {
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
        }   
    }
    static boolean cmp(Thoigian a, Thoigian b){
        if(a.x!=b.x) return a.x > b.x;
        if(a.y!=b.y) return a.y > b.y;
        if(a.z!=b.z) return a.z > b.z;
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Thoigian[] a = new Thoigian[n];
        for(int i=0;i<n;i++)
        {
            Thoigian x = new Thoigian();
            x.get(sc);
            a[i]=x;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(cmp(a[i],a[j])){
                    Thoigian c = a[i];
                    a[i] = a[j];
                    a[j]=c;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d %d %d\n",a[i].x,a[i].y,a[i].z);
        }
    }
}
