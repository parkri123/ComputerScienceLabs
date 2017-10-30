package me.parkri123.labs.geometry;

public class Quad {
    private double qPerimeter;
    private double qArea;
    private double qSideAB;
    private double qSideBC;
    private double qSideCD;
    private double qSideDA;
    private double qSideBD;

    public double getqPerimeter() {
        qPerimeter = getqSideAB() + getqSideBC() + getqSideCD() + getqSideDA();
        return qPerimeter;
    }

    public void setqPerimeter(double qPerimeter) {
        this.qPerimeter = qPerimeter;
    }

    public double getqArea() {
        qArea = calculateQArea();
        return qArea;
    }

    public void setqArea(double qArea) {
        this.qArea = qArea;
    }

    public double getqSideAB() {
        return qSideAB;
    }

    public void setqSideAB(double qSideAB) {
        this.qSideAB = qSideAB;
    }

    public double getqSideBC() {
        return qSideBC;
    }

    public void setqSideBC(double qSideBC) {
        this.qSideBC = qSideBC;
    }

    public double getqSideCD() {
        return qSideCD;
    }

    public void setqSideCD(double qSideCD) {
        this.qSideCD = qSideCD;
    }

    public double getqSideDA() {
        return qSideDA;
    }

    public void setqSideDA(double qSideDA) {
        this.qSideDA = qSideDA;
    }

    public double getqSideBD() {
        return qSideBD;
    }

    public void setqSideBD(double qSideBD) {
        this.qSideBD = qSideBD;
    }
    public double calculateQArea ()
    {
        double s1 = (getqSideAB()+getqSideBC()+getqSideBD())/2;
        double area1 = Math.sqrt(s1*(s1-getqSideAB())*(s1-getqSideBC())*(s1-getqSideBD()));
        double s2 = (getqSideCD()+getqSideDA()+getqSideBD())/2;
        double area2 = Math.sqrt(s2*(s2-getqSideCD())*(s2-getqSideDA())*(s2-getqSideBD()));
        double qarea = area1 + area2;
        return qarea;
    }
}