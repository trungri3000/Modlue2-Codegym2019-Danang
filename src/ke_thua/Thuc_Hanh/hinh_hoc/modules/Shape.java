package ke_thua.Thuc_Hanh.hinh_hoc.modules;

public abstract class Shape{
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    private String color = "red";
    private boolean filled = true;

    @Override
    public String toString() {
        return "shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
