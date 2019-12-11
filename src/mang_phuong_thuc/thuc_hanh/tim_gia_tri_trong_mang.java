package mang_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class tim_gia_tri_trong_mang{
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("nhập số lượng tỉ phú : ");
            size =scanner.nextInt();
            if(size>20){
                System.out.println("quá số lượng cho phép !!!  ");
            }
        }
        while(size>20);
        array = new int[size];
        int i = 0 ;
        while(i < array.length){
            System.out.println(" hãy nhập tỉ phú " + (i + 1) + " : ");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.println("danh sâch tỉ phú là : ");
        for (int j = 0 ; j <array.length;j++){
            System.out.println(array[j]);
            }
        int max = array[0];
        int index = 1;
        for (int j=0 ;j < array.length;j++){
            if(array[j]>max){
                max = array[j];
                index=j+1;
            }
        }
        System.out.println("tỉ phú giàu nhát là " + max + "ở vị trí" + index);
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("vị trí các tỉ phú được đảo ngược ", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }


}
