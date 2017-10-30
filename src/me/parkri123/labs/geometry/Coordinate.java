package me.parkri123.labs.geometry;

import java.util.*;
public class Coordinate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        while (choice != 3) {
            System.out.println("Welcome to Area and Perimeter Finder! Choose a shape:\n1) Triangle\n2) Quadrilateral\n3) Quit");
            if (in.hasNextInt()) {
                choice = in.nextInt();
                if (choice == 1 || choice == 2 || choice == 3){
                switch (choice) {
                    case 1:
                        System.out.println("Enter the first point of your triangle in the format (x y)");
                        Point ta = new Point(in.nextInt(), in.nextInt());
                        System.out.println("Enter the second point of your triangle in the format (x y)");
                        Point tb = new Point(in.nextInt(), in.nextInt());
                        System.out.println("Enter the third point of your triangle in the format (x y)");
                        Point tc = new Point(in.nextInt(), in.nextInt());
                        Triangle t = new Triangle();
                        t.settSideAB(ta.distance(tb));
                        t.settSideBC(tb.distance(tc));
                        t.settSideCA(tc.distance(ta));
                        System.out.println("Area of triangle is " + t.gettArea());
                        System.out.println("Perimeter of triangle is " + t.gettPerimeter());
                        break;
                    case 2:
                        System.out.println("Enter the first point of your quadrilateral in the format (x y)");
                        Point qa = new Point(in.nextInt(), in.nextInt());
                        System.out.println("Enter the second point of your quadrilateral in the format (x y)");
                        Point qb = new Point(in.nextInt(), in.nextInt());
                        System.out.println("Enter the third point of your quadrilateral in the format (x y)");
                        Point qc = new Point(in.nextInt(), in.nextInt());
                        System.out.println("Enter the fourth point of your quadrilateral in the format (x y)");
                        Point qd = new Point(in.nextInt(), in.nextInt());
                        Quad q = new Quad();
                        q.setqSideAB(qa.distance(qb));
                        q.setqSideBC(qb.distance(qc));
                        q.setqSideCD(qc.distance(qd));
                        q.setqSideDA(qd.distance(qa));
                        q.setqSideBD(qb.distance(qd));
                        System.out.println("Area of quadrilateral is " + q.getqArea());
                        System.out.println("Perimeter of quadrilateral is " + q.getqPerimeter());
                        break;
                    case 3:
                        System.out.println("Exiting program...");
                        break;
                }
                }
                else {
                    System.out.println("Invalid number");
                }

            } else {
                System.out.println("Invalid Input");
            }
        }
    }
}