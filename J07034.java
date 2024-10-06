
package Vao_Ra_FILE;

import java.util.*;
import java.io.*;
public class J07034 {
    static class DSMH{
        String code, name, method;
        public DSMH(String c, String n, String m){
            code=c;
            name=n;
            method=m;
        }
        public boolean big(DSMH b){
            if(name.compareTo(b.name) > 0) return true;
            return false;
        }
        public String toString(){
            return code + " " + name + " " + method;
        }
    }
    public static void main(String[] args) throws IOException{
    
    Scanner sc = new Scanner(new File("D:/MONHOC.in"));
        // Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DSMH[] a = new DSMH[n];
        sc.nextLine();
        for(int i=0; i<n; i++){
            a[i] = new DSMH(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        DSMH tmp;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(a[i].big(a[j])){
                    tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
        for(int i=0;i<n;i++) System.out.println(a[i].toString());
    }
}
