package Homework.Fifth;

public class ArithmeticOp {

    public static int max3(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static double max3(double a, double b, double c) {
        return Math.max(a, Math.max(b, c));
    }

    public static boolean eq(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean areTriangular(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static double[] rescale(double[] array) {
        double min = array[0];
        double max = array[0];
        for (double value : array) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
        double range = max - min;
        double[] rescaled = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            rescaled[i] = (array[i] - min) / range;
        }
        return rescaled;
    }

    public static boolean any(boolean[] array) {
        for (boolean value : array) {
            if (value) {
                return true;
            }
        }
        return false;
    }
}