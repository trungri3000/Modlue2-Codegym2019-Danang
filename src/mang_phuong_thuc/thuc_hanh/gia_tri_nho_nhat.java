package mang_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class gia_tri_nho_nhat{
    public static int list(int[] array) {
        int min = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        System.out.println("Giá trị nhỏ nhất là : " + min);
        return index;
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhập phần tử thứ " + (i + 1) + " cho mảng: ");
            array[i] = scanner.nextInt();
        }
        int index = list(array);
        System.out.println("vị trí của giá trị nhỏ nhất là : " + (index +1));
    }
}
