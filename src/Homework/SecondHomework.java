package Homework;

public class SecondHomework {

    public static void main(String[] args) {

//===================METHODS=================//
//===================1=================//

        sum("Hello", "World");
        sum(10, 20);

        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        printReverseWaveform(array);
    }

    public static void sum(String a, String b) {
        System.out.println(a + b);
    }

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

//===================MultiDimensional=================//

    public static void printReverseWaveform(int[][] array) {
        if (array == null || array.length == 0) {
            System.out.println("The array is empty ");
            return;
        }

        int rows = array.length;
        int cols = array[0].length;

        // Traverse columns
        for (int col = 0; col < cols; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < rows; row++) {
                    System.out.print(array[row][col]);
                }
            } else {
                for (int row = rows - 1; row >= 0; row--) {
                    System.out.print(array[row][col]);
                }
            }
        }
    }
}

