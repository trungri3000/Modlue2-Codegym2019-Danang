package lop_doi_tuong.thuc_hanh.hinh_hoc.modules;

public class Square extends Rectangle{
    private double side =1;

    public Square() {
    }

    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}

