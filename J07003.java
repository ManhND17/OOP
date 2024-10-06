
package Vao_Ra_FILE;

import java.util.*;
import java.io.*;
import java.math.*;
public class J07003 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DATA.in"));
        BigInteger a = sc.nextBigInteger();
        while(a.toString().length()>1){
            int length = a.toString().length();
            BigInteger c = new BigInteger(a.toString().substring(0,length/2));
            BigInteger b = new BigInteger(a.toString().substring(length/2,length));
            a = c.add(b);
            System.out.println(a);
        }
        
    }
}
