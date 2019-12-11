package ke_thua.thuc_hanh.hinh_hoc.modules;

public abstract class shape{
    public shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public shape() {
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
