package ke_thua.Thuc_Hanh.hinh_hoc.view;

import ke_thua.Thuc_Hanh.hinh_hoc.modules.Circle;
import ke_thua.Thuc_Hanh.hinh_hoc.modules.Rectangle;
import ke_thua.Thuc_Hanh.hinh_hoc.modules.Shape;
import ke_thua.Thuc_Hanh.hinh_hoc.modules.Square;

public class show{
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(3);
        System.out.println(circle);
        circle = new Circle("red",false,3 );
        System.out.println(circle);
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle.setLength(2.5);rectangle.setWidth(3);
        System.out.println(rectangle);

        rectangle = new Rectangle("black",false,3,2.5);
        System.out.println(rectangle);
        Square square = new Square();
        System.out.println(square);

        square.setSide(5.8);
        System.out.println(square);

        square = new Square("white",true,5.8,5.8);
        System.out.println(square);
    }
}
