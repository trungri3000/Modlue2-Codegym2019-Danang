package ngon_ngu_lap_trinh_java.thuc_hanh;

import java.util.Scanner;

public class tinh_so_ngay_trong_thang{
    public static void main(String[] args) {
        System.out.println("nhấp tháng cần hiển thị số ngày : ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month){
            case 1:
                System.out.println("tháng 1 có 30 ngày ");
                break;
            case 3:
                System.out.println("tháng 3 có 30 ngày ");
                break;
            case 5:
                System.out.println("tháng 5 có 30 ngày ");
                break;
            case 7:
                System.out.println("tháng 7 có 30 ngày ");
                break;
            case 8:
                System.out.println("tháng 8 có 30 ngày ");
                break;
            case 10:
                System.out.println("tháng 1o có 30 ngày ");
                break;
            case 12:
                System.out.println("tháng 12 có 30 ngày ");
                break;
            case 4:
                System.out.println("tháng 4 có 31 ngày ");
                break;
            case 6:
                System.out.println("tháng 6 có 31 ngày ");
                break;
            case 9:
                System.out.println("tháng 9 có 31 ngày ");
                break;
            case 11:
                System.out.println("tháng 11 có 31 ngày ");
                break;
            case 2:
                System.out.println("tháng 2 có 28 hoặc 29 ngày ");
                break;
        }
    }
}
