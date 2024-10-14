package Homework.Fifth;

public class Polygon {

    private final Point[] vertices;

    public Polygon(double[] xCoords, double[] yCoords) {
        if (xCoords.length != yCoords.length) {
            throw new IllegalArgumentException("Coordinate arrays must have the same length.");
        }
        vertices = new Point[xCoords.length];
        for (int i = 0; i < xCoords.length; i++) {
            vertices[i] = new Point(xCoords[i], yCoords[i]);
        }
    }

    public Polygon(Point[] points) {
        vertices = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            vertices[i] = new Point(points[i]);
        }
    }

    public Polygon(Polygon other) {
        vertices = new Point[other.vertices.length];
        for (int i = 0; i < other.vertices.length; i++) {
            vertices[i] = new Point(other.vertices[i]);
        }
    }

    public double getX(int index) {
        return vertices[index].getX();
    }

    public double getY(int index) {
        return vertices[index].getY();
    }

    public void setX(int index, double x) {
        vertices[index].setX(x);
    }

    public void setY(int index, double y) {
        vertices[index].setY(y);
    }

    public double getEdgeLength(int index) {
        if (index < 0 || index >= vertices.length) {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }
        int nextIndex = (index + 1) % vertices.length;
        return vertices[index].distance(vertices[nextIndex]);
    }

    public double perimeter() {
        double totalLength = 0;
        for (int i = 0; i < vertices.length; i++) {
            totalLength += getEdgeLength(i);
        }
        return totalLength;
    }

    @Override
    public String toString() {
        String result = "Polygon: ";
        for (Point vertex : vertices) {
            result += vertex.toString() + " ";
        }
        return result;
    }
}

