
package Xau_Ky_tu;

import java.util.*;
public class J03031 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
          sc.nextLine();
          HashSet<Character> h = new HashSet<>();
          String s = sc.nextLine();
          int k = sc.nextInt();
          for(int i=0;i<s.length();i++){
              h.add(s.charAt(i));
          }
          if(s.length()>=26&&h.size()+k>=26){
              System.out.println("YES");
          }
          else System.out.println("NO");
        }
    }
}
