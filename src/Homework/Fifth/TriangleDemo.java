package Homework.Fifth;

public class TriangleDemo {

    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(0, 0, 3, 0, 0, 4);
        Triangle triangle2 = new Triangle(new Point(1, 1), new Point(4, 1), new Point(1, 5));
        Triangle triangle3 = new Triangle(triangle1);
        Triangle triangle4 = new Triangle(0, 0, 5, 0, 3, 4);


        Triangle[] triangles = {triangle1, triangle2, triangle3, triangle4};

        for (Triangle triangle : triangles) {
            System.out.println(triangle);
            System.out.println("Perimeter: " + triangle.perimeter());
            System.out.println("Area: " + triangle.area());
            Point com = triangle.centerOfMass();
            System.out.println("Center of Mass: (" + com.getX() + ", " + com.getY() + ")");
            System.out.println("Is Equilateral: " + triangle.isEquilateral());
            System.out.println("Is Isosceles: " + triangle.isIsosceles());
            System.out.println("Is Scalene: " + triangle.isScalene());
            System.out.println();
        }
    }
}
