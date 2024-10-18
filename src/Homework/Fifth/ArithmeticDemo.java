package Homework.Fifth;

public class ArithmeticDemo {

    public static void main(String[] args) {

        System.out.println("Max of 3 integers: " + ArithmeticOp.max3(3, 7, 5));
        System.out.println("Max of 3 doubles: " + ArithmeticOp.max3(2.5, 3.8, 1.2));

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {1, 2, 4};
        System.out.println("Array1 equals Array2: " + ArithmeticOp.eq(array1, array2));
        System.out.println("Array1 equals Array3: " + ArithmeticOp.eq(array1, array3));

        System.out.println("Can 3, 4, 5 form a triangle? " + ArithmeticOp.areTriangular(3, 4, 5));
        System.out.println("Can 1, 2, 3 form a triangle? " + ArithmeticOp.areTriangular(1, 2, 3));

        double[] values = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] rescaledValues = ArithmeticOp.rescale(values);
        System.out.print("Rescaled values: ");
        for (double value : rescaledValues) {
            System.out.print(value + " ");
        }
        System.out.println();

        boolean[] boolArray = {false, false, true, false};
        System.out.println("Any true in boolArray? " + ArithmeticOp.any(boolArray));
    }
}
