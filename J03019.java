
package Xau_Ky_tu;

import java.util.*;
public class J03019 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> a = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(!a.empty()){
                while(!a.empty()&&a.peek()<s.charAt(i))
                    a.pop();
                }
            a.push(s.charAt(i));  
        }
        String ss="";
        while(!a.empty()){
            ss=a.peek()+ss;
            a.pop();
        }
        System.out.println(ss);
    }
}
