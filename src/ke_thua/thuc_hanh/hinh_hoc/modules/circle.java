package ke_thua.thuc_hanh.hinh_hoc.modules;

public class circle extends shape{
    private double radius=1;

    public circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
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

