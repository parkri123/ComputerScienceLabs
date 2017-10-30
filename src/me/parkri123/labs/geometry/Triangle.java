package me.parkri123.labs.geometry;

public class Triangle {
    private double tPerimeter;
    private double tArea;
    private double tSideAB;
    private double tSideBC;
    private double tSideCA;

    public Triangle() {
        tPerimeter = 0;
        tArea = 0;
        tSideAB = 0;
        tSideBC = 0;
        tSideCA = 0;
    }

    public double gettPerimeter() {
        tPerimeter = gettSideAB() + gettSideBC() + gettSideCA();
        return tPerimeter;
    }

    public void settPerimeter(double tPerimeter) {
        this.tPerimeter = tPerimeter;
    }

    public double gettArea() {
        tArea = calculateTArea();
        return tArea;
    }

    public void settArea(double tArea) {
        this.tArea = tArea;
    }

    public double gettSideAB() {
        return tSideAB;
    }

    public void settSideAB(double tSideAB) {
        this.tSideAB = tSideAB;
    }

    public double gettSideBC() {
        return tSideBC;
    }

    public void settSideBC(double tSideBC) {
        this.tSideBC = tSideBC;
    }

    public double gettSideCA() {
        return tSideCA;
    }

    public void settSideCA(double tSideCA) {
        this.tSideCA = tSideCA;
    }

    public double calculateTArea() {
        double s = (gettSideAB()+gettSideBC()+gettSideCA())/2;
        double area =  Math.sqrt(s*(s-gettSideAB())*(s-gettSideBC())*(s-gettSideCA()));
        return area;
    }
}