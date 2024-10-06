package JAVA_Co_Ban;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author MyPC
 */
import java.util.Scanner;
public class J01010 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int t=Integer.parseInt(scanner.nextLine());
        while(t>0)
        {
        t--;
        String s=scanner.nextLine();
        boolean ok=true;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='0'&&s.charAt(i)!='1'&&s.charAt(i)!='9'&&s.charAt(i)!='8')
            {
                ok=false;
                break;
                
            }
        }
        if(ok==false) System.out.println("INVALID");
        else{
            String ss = "";
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='0'||s.charAt(i)=='9'||s.charAt(i)=='8')
                {
                    ss+="0";
                }
                else if(s.charAt(i)=='1'){
                    ss+="1";
                }
            }
            int x=-1;
            for(int i=0;i<s.length();i++)
            {
                if(ss.charAt(i)!='0')
                {
                    x=i;
                    break;
                }
            }
            if(x==-1) System.out.println("INVALID");
            else
            {
            for(int i=x;i<s.length();i++)
            {
                System.out.printf("%c",ss.charAt(i));
            }
            System.out.println();
            }
        }
        }
    }
}
