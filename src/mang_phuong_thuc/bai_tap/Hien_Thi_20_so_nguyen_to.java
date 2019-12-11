package mang_phuong_thuc.bai_tap;

import java.util.Scanner;

public class Hien_Thi_20_so_nguyen_to{
    public static boolean check(double number) {
        double check = 0;
        for (check = 2; check <= Math.sqrt(number); check++) {
            if (number % check == 0) {
                return false;
            }
        }
        return true;
    }

    public static double listsnt(double number) {
        double listsnt = 0;
        for (listsnt = 0; listsnt <= number; listsnt++) {
            if (Hien_Thi_20_so_nguyen_to.check(listsnt)) {

                System.out.println(listsnt);
            }
        }
        return (listsnt);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;
        do {
            System.out.println("vui lòng nhập các số cần hiển thị dưới 20");
            number = scanner.nextDouble();
        } while (number > 20);
        listsnt(number);
    }
}