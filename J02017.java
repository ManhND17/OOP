/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mang;
import java.util.Scanner;
import java.util.Stack;
public class J02017 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> a=new Stack<>();
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            if(a.empty()) a.push(x);
            else
            {
                if((a.lastElement()+x)%2==0) a.pop();
                else a.push(x);
            }
        }
        System.out.println(a.size());
    }
}
