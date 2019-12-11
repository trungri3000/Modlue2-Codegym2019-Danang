package mang_phuong_thuc.bai_tap;

import java.util.ArrayList;
import java.util.Scanner;

public class Tim_so_nguyen_to{
    public static boolean checkSnt(double number) {
        double checkSnt = 0;
        for (checkSnt = 2; checkSnt <= Math.sqrt(number); checkSnt++) {
            if (number % checkSnt == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("nhập số cần kiểm tra : ");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        if (number < 2) {
            System.out.println(number + "là số nguyên tố ");
            return;
        } else {
           if(checkSnt(number)) {
               System.out.println(number + "là số nguyên tố ");
           }
            return;
        }

    }
}