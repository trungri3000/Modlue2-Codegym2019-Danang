package ngon_ngu_lap_trinh_java.thuc_hanh;

import java.util.Scanner;

public class su_dung_toan_tu{
    public static void main(String[] args) {
        float witdh;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu rong : ");
        witdh  =scanner.nextFloat();
        System.out.println(witdh);
        System.out.println("nhap chieu dai : ");
        height =scanner.nextFloat();
        System.out.println(height);
        System.out.println("dien tich la " + witdh*height);

    }
}
