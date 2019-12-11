package lop_doi_tuong.bai_tap;

import java.util.Scanner;

public class QuadraticEquation{
    public QuadraticEquation() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double a;
    public double b;
    public double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return 2 * b - (4 * a * c);
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant()) / (2 * a));
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant()) / (2 * a));
    }

    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        System.out.println("nhập các biến của phương trình : ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a : ");
        quadraticEquation.setA(scanner.nextDouble());
        System.out.println("nhập b : ");
        quadraticEquation.setB(scanner.nextDouble());
        System.out.println("nhập c : ");
        quadraticEquation.setC(scanner.nextDouble());
        if(quadraticEquation.getDiscriminant()>0) {
            System.out.println("phương trình có nghiệm " + quadraticEquation.getRoot1());
            System.out.println("phương trình có nghiệm" + quadraticEquation.getRoot2());
            if (quadraticEquation.getDiscriminant() == 0) {
                System.out.println("phương trình có nghiệm" + quadraticEquation.getRoot1());
            }
        }else{
            System.out.println("phương trình vô nghiệm");
        }
    }
}

