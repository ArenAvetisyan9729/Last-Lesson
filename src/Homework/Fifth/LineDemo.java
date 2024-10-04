package Homework.Fifth;

import java.util.Scanner;

public class LineDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates (x1 y1 x2 y2): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        Line line1 = new Line(x1, y1, x2, y2);
        System.out.println("Length of Line 1: " + line1.length());
        System.out.println("Midpoint of Line 1: " + line1.midpoint());

        System.out.println("Enter coordinates (x1 y1 and x2 y2): ");
        Point pointA = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point pointB = new Point(scanner.nextDouble(), scanner.nextDouble());

        Line line2 = new Line(pointA, pointB);
        System.out.println("Length of Line 2: " + line2.length());
        System.out.println("Midpoint of Line 2: " + line2.midpoint());

        Line line1Copy = new Line(line1);
        System.out.println("Copy of Line 1: " + line1Copy);

        line1.setStart(line2.midpoint());
        System.out.println("New Length of Line 1: " + line1.length());
        System.out.println("New Midpoint of Line 1: " + line1.midpoint());

        scanner.close();
    }
}
