package Homework.Fifth;

public class PolygonDemo {

    public static void main(String[] args) {

        double[] xCoords = {0, 4, 4, 0};
        double[] yCoords = {0, 0, 3, 3};
        Polygon polygon1 = new Polygon(xCoords, yCoords);
        System.out.println(polygon1);
        System.out.println("Perimeter: " + polygon1.perimeter());

        Point[] points = {new Point(1, 1), new Point(5, 1), new Point(5, 4), new Point(1, 4)};
        Polygon polygon2 = new Polygon(points);
        System.out.println(polygon2);
        System.out.println("Perimeter: " + polygon2.perimeter());

        Polygon polygon3 = new Polygon(polygon1);
        System.out.println(polygon3);
        System.out.println("Perimeter: " + polygon3.perimeter());

        System.out.println("Vertex 0: " + polygon2.getX(0) + ", " + polygon2.getY(0));
        polygon2.setX(0, 2);
        polygon2.setY(0, 2);
        System.out.println("Updated Vertex 0: " + polygon2.getX(0) + ", " + polygon2.getY(0));
    }
}
