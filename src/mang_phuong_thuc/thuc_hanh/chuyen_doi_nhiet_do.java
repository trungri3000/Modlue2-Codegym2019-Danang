package mang_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class chuyen_doi_nhiet_do{
    public static double cToF(double doC) {
        double cToF = (9.0 / 5) * doC + 32;
        return cToF;
    }

    public static double fToC(double doF) {
        double fToC = (5.0 / 9) * (doF - 32);
        return fToC;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double doF;
        double doC;
        int choice;
        do {
            System.out.println("MENU : ");
            System.out.println("1.Chuyển độ C thành độ F : ");
            System.out.println("2.Chuyển độ F thành đồ C : ");
            System.out.println("3.Exit program ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("nhập độ C : ");
                    doC = scanner.nextDouble();
                    chuyen_doi_nhiet_do.cToF(doC);
                    System.out.println("nhiệt độ sau khi chuyển đổi là : " + cToF(doC));
                    break;
                case 2:
                    System.out.println("nhập độ F : ");
                    doF = scanner.nextDouble();
                    chuyen_doi_nhiet_do.fToC(doF);
                    System.out.println("nhiệt độ sau khi chuyển đổi là : " + fToC(doF));
                    break;
                case 3:
                    System.exit(3);

            }
        } while (choice != 0);

    }
}
