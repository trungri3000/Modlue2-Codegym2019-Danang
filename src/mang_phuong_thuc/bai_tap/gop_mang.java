package mang_phuong_thuc.bai_tap;

import java.util.Scanner;

public class gop_mang{
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3;
        int size;
        do {
            System.out.println("Nhập hai kích thước mảng : ");
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhập kích thước mảng 1 : ");
            size = scanner.nextInt();
            arr1 = new int[size];
            for (int i = 0; i < arr1.length; i++) {
                System.out.println("nhập từng phần tử trong mảng 1 : ");
                arr1[i] = scanner.nextInt();
            }
            System.out.println("nhập kích thước mảng 2 : ");
            size = scanner.nextInt();
            arr2 = new int[size];
            for (int i = 0; i < arr2.length; i++) {
                System.out.println("nhập từng phần tử trong mảng 2 : ");
                arr2[i] = scanner.nextInt();
            }
           arr3=new int[arr1.length+arr2.length];
            for (int i=0;i<arr1.length;i++){
                arr3[i]=arr1[i];
            }
            for(int i =arr1.length;i<arr3.length;i++){
                arr3[i]=arr2[i- arr1.length];
            }
            for(int i =0;i<arr3.length;i++){
                System.out.println(arr3[i]);
            }

        }
        while (size > 100);


    }
}
