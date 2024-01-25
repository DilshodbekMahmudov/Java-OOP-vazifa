package com.project;

public class Point {

    private double x;

    private double y;

    private double z;


    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;

    }

    public static void main(String[] args) {

        Point point=new Point(3.0, 4.5, 2.7);

        double x= point.getX();
        double y= point.getY();
        double z= point.getZ();

        System.out.println("X:" + x);
        System.out.println("Y:" + y);
        System.out.println("Z:" + z);
    }
}