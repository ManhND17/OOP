
package Mang;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class J02012 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
           a.add(sc.nextInt());
           Collections.sort(a);
           System.out.printf("Buoc %d: ",i);
           a.forEach(k -> System.out.printf("%d ", k));
           System.out.println("");
        }
        
    }
}
