package mang_phuong_thuc.bai_tap;

import java.util.Scanner;

public class Tim_So_Nguyen_To_Nho_Hon_100{
    public static double checkSnt(double number) {
        double checkSnt = 0;
        for (checkSnt = 2; checkSnt <=number; checkSnt++) {
            if(Tim_so_nguyen_to.checkSnt(checkSnt)) {
                System.out.println(checkSnt);
            }
        }
        return checkSnt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;
        do {
            System.out.println("nhập giới hạn các số nguyên tố cần hiển thị dưới 100");
            number = scanner.nextDouble();
        } while (number > 100);
        checkSnt(number);
    }

}
