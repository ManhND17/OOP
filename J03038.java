
package Xau_Ky_tu;

import java.util.Scanner;
import java.util.HashSet;
public class J03038 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        HashSet<Character> a= new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            a.add(s.charAt(i));
        }
        System.out.print(a.size());
    }
}
