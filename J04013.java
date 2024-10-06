
package Khai_Bao_Lop_vaDoi_Tuong;
import java.util.*;
public class J04013 {
    static class Tuyensinh{
        String mts,ten;
        float toan,ly,hoa;
        public void get(Scanner sc)
        {
            mts = sc.nextLine();
            ten = sc.nextLine();
            toan = sc.nextFloat();
            ly = sc.nextFloat();
            hoa = sc.nextFloat();
        }
        public float diem()
        {
            float tong =0;
            String s = mts.substring(0,3);
            if(s.compareTo("KV3")==0) tong+=2.5;
            if(s.compareTo("KV2")==0) tong=1;
            if(s.compareTo("KV1")==0) tong+=0.5;
            return tong;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Tuyensinh a = new Tuyensinh();
        a.get(sc);
        String s="";
        float tong = a.toan*2+a.hoa+a.ly;
        if(tong+a.diem()>=24) s="TRUNG TUYEN";
        else s="TRUOT";
        System.out.printf("%s %s ",a.mts,a.ten);
        if((int) (a.diem())== a.diem())
        {
        System.out.printf("%.0f ",a.diem());
        }
        else{
            System.out.printf("%.1f ",a.diem());
        }
        if((int)tong== tong)
        {
        System.out.printf("%.0f ",tong);
        }
        else{
            System.out.printf("%.1f ",tong);
        }
        System.out.printf("%s \n",s);
    }
    
}
