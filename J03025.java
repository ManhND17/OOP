/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xau_Ky_tu;

import java.util.Scanner;
public class J03025 {
    static String Xau_Doi_Xung(String s)
    {
        int x=0;
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) x++;
        }
        if(x==1||x==0&&s.length()%2==1) return "YES";
        return "NO";
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        while(t-->0)
        {
            String s= sc.nextLine();
            System.out.println(Xau_Doi_Xung(s));
        }
    }
}
