
package Xau_Ky_tu;

import java.util.Scanner;
public class J03032 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String l=sc.nextLine();
            String[] w=l.split("[' ']+");
            for(int i=0;i<w.length;i++)
            {
                for(int j=0;j<w[i].length();j++)
                {
                    System.out.print(w[i].charAt(w[i].length()-1-j));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
