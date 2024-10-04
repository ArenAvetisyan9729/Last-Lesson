package Homework.Fifth;

public class Triangle {

    private Point vertex1;
    private Point vertex2;
    private Point vertex3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.vertex1 = new Point(x1, y1);
        this.vertex2 = new Point(x2, y2);
        this.vertex3 = new Point(x3, y3);
    }

    public Triangle(Point v1, Point v2, Point v3) {
        this.vertex1 = v1;
        this.vertex2 = v2;
        this.vertex3 = v3;
    }

    public Triangle(Triangle triangle) {
        this.vertex1 = new Point(triangle.vertex1.getX(), triangle.vertex1.getY());
        this.vertex2 = new Point(triangle.vertex2.getX(), triangle.vertex2.getY());
        this.vertex3 = new Point(triangle.vertex3.getX(), triangle.vertex3.getY());
    }

    public Point getVertex1() {
        return vertex1;
    }

    public void setVertex1(Point vertex1) {
        this.vertex1 = vertex1;
    }

    public Point getVertex2() {
        return vertex2;
    }

    public void setVertex2(Point vertex2) {
        this.vertex2 = vertex2;
    }

    public Point getVertex3() {
        return vertex3;
    }

    public void setVertex3(Point vertex3) {
        this.vertex3 = vertex3;
    }

    public double perimeter() {
        return vertex1.distance(vertex2) + vertex2.distance(vertex3) + vertex3.distance(vertex1);
    }

    public double area() {
        return 0.5 * Math.abs(
                vertex1.getX() * (vertex2.getY() - vertex3.getY()) +
                        vertex2.getX() * (vertex3.getY() - vertex1.getY()) +
                        vertex3.getX() * (vertex1.getY() - vertex2.getY())
        );
    }

    public Point centerOfMass() {
        double centerX = (vertex1.getX() + vertex2.getX() + vertex3.getX()) / 3;
        double centerY = (vertex1.getY() + vertex2.getY() + vertex3.getY()) / 3;
        return new Point(centerX, centerY);
    }

    public boolean isEquilateral() {
        double side1 = vertex1.distance(vertex2);
        double side2 = vertex2.distance(vertex3);
        double side3 = vertex3.distance(vertex1);
        return side1 == side2 && side2 == side3;
    }

    public boolean isIsosceles() {
        double side1 = vertex1.distance(vertex2);
        double side2 = vertex2.distance(vertex3);
        double side3 = vertex3.distance(vertex1);
        return side1 == side2 || side2 == side3 || side1 == side3;
    }

    public boolean isScalene() {
        double side1 = vertex1.distance(vertex2);
        double side2 = vertex2.distance(vertex3);
        double side3 = vertex3.distance(vertex1);
        return side1 != side2 && side2 != side3 && side1 != side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "vertex1=(" + vertex1.getX() + ", " + vertex1.getY() + "), " +
                "vertex2=(" + vertex2.getX() + ", " + vertex2.getY() + "), " +
                "vertex3=(" + vertex3.getX() + ", " + vertex3.getY() + ")}";
    }
}
