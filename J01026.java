package JAVA_Co_Ban;


import java.util.Scanner;
public class J01026 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            t--;
            long n=sc.nextLong();
            long m =(long) Math.sqrt(n);
            if(m*m==n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
