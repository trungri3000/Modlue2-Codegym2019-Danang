package ngon_ngu_lap_trinh_java.thuc_hanh;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import sun.applet.Main;

import java.util.Scanner;

public class so_nguyen_to{
    public static void main(String[] args) {
        System.out.println("nhập số cần kiểm tra : ");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        if(number<2){
            System.out.println(number + "không phải là số nguyên tố ");
            }
        else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)){
                if(number % i ==0 ) {
                    check = false;
                    break;
                }
                i++;

            }if(check){
                System.out.println(number+"là số nguyên tố");
            }else{
                System.out.println(number+"không phải là số nguyên tố");
            }
        }
    }
}
