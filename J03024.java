/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_tu;

import java.util.Scanner;
public class J03024 {
    static String So_uu_the(String s)
    {
        if(s.charAt(0)=='0') return "INVALID";
        int x=0;
        int y=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)<'0' || s.charAt(i)>'9') return "INVALID";
            else {
                if((int)s.charAt(i)%2==0)
                {
                    x++;
                }
                else y++;
            }
        }
        if(x==y) return "NO";
        if(x>y&&s.length()%2!=0) return "NO";
        if(x<y&&s.length()%2!=1) return "NO";
        return "YES";
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s= sc.nextLine();
            System.out.println(So_uu_the(s));
        }
    }
}
