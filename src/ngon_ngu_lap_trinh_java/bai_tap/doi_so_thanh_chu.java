package ngon_ngu_lap_trinh_java.bai_tap;

import java.util.Scanner;

public class doi_so_thanh_chu{
    public String demsole(int number) {
        switch (number) {
            case 1:
                return ("one");
            case 2:
                return ("two");
            case 3:
                return ("three");
            case 4:
                return ("four");
            case 5:
                return ("five");
            case 6:
                return ("six");
            case 7:
                return ("seven");
            case 8:
                return ("eight");
            case 9:
                return ("nine");
            case 10:
                return ("ten");
            case 11:
                return ("eleven");
            case 12:
                return ("twelve");
            case 13:
                return ("thirteen");
            case 14:
                return ("fourteen");
            case 15:
                return ("fifteen");
            case 16:
                return ("sixteen");
            case 17:
                return ("seventeen");
            case 18:
                return ("eighteen");
            case 19:
                return ("nineteen");
            case 20:
                return ("twenty");

        }
        return (" ");
    }

    public String demHangChuc(int number2) {
        switch (number2) {
            case 1:
                return ("eleven");
            case 2:
                return ("twety");

            case 3:
                return ("thirty");
            case 4:
                return ("fourty");

            case 5:
                return ("fifty");
            case 6:
                return ("sixty");
            case 7:
                return ("seventy");
            case 8:
                return ("eighty");
            case 9:
                return ("ninety");
        }
        return (" ");
    }

    public String demhangle(int number3) {
        switch (number3) {
            case 1:
                return ("one");
            case 2:
                return ("two");
            case 3:
                return ("three");
            case 4:
                return ("four");
            case 5:
                return ("five");
            case 6:
                return ("six");
            case 7:
                return ("seven");
            case 8:
                return ("eight");
            case 9:
                return ("nine");
        }
        return (" ");
    }

    public String demhangtram(int number4) {
        switch (number4) {
            case 1:
                return ("one hundred");
            case 2:
                return ("two hundred");
            case 3:
                return ("three hunded");
            case 4:
                return ("four hundred");
            case 5:
                return ("five hundred");
            case 6:
                return ("six hundred");
            case 7:
                return ("seven hundred");
            case 8:
                return ("eight hundred");
            case 9:
                return ("nine hunded");
        }
        return (" ");

    }


    public static void main(String[] args) {
        doi_so_thanh_chu doi_so_thanh_chu = new doi_so_thanh_chu();
        System.out.println("nhập số cần đọc : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number <= 20) {
            String sole = doi_so_thanh_chu.demsole(number);
            System.out.println(sole);
        }
        if (number > 20 && number < 100) {
            int number2 = number / 10;
            int number3 = number % 10;
            String hangChuc = doi_so_thanh_chu.demHangChuc(number2);
            String hangle = doi_so_thanh_chu.demhangle(number3);
            System.out.println(hangChuc + "and" + hangle);
        }
        if (number > 100 && number < 1000) {
            int number4 = number / 100;
            int number2 = number % 100 ;
            String hangtram = doi_so_thanh_chu.demhangtram(number4);
            if (number2<20) {
                String solehangchuc = doi_so_thanh_chu.demsole(number);
                System.out.println(hangtram + "and" + solehangchuc);
            } else {
                int number3=number/10;
                String hangChuc = doi_so_thanh_chu.demHangChuc(number2);
                String hangle = doi_so_thanh_chu.demhangle(number3);
                System.out.println(hangtram + hangChuc + hangle);
            }
        }

    }
}
