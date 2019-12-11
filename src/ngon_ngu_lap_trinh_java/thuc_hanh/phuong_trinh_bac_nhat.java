package ngon_ngu_lap_trinh_java.thuc_hanh;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class phuong_trinh_bac_nhat{
    public static void main(String[] args) {
        System.out.println("GIẢI PHƯƠNG TRÌNH BẬC NHẤT a*x + b = 0 ");
        System.out.println("nhập các biến : ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập biến a ");
        double a = scanner.nextDouble();
        System.out.println("nhập biến b ");
        double b = scanner.nextDouble();
        if(a!=0){
            double ketqua = -b/a;
            System.out.println("kết quả của phương trình là : "+ "x = " + ketqua );
        }
        else{
            if(a==0){
                System.out.println("kết quả của phương trình là : "+"x =" + -b);
            }
            else{
                System.out.println("phương trình vô nghiệm ");
            }
        }
    }
}
