package ke_thua.Thuc_Hanh.hinh_hoc.modules;

public class Circle extends Shape{
    private double radius = 1;

    public Circle() {
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}

