package Homework;

public class FourthHomework {
    public static void main(String[] args) {

        int result = Fibonacci.fib(4);
        System.out.println(result);
        int result1 = Factorial.fact(4);
        System.out.println(result1);
        int result2 = Digit.dig(5, 3);
        System.out.println(result2);
        int[] arr = {1, 2, 3, 4, 5};
        Reverse.reverse(arr, arr.length - 1);
        System.out.println(" ");
        String str = "oko";
        boolean palindrome = Palindrome.palindrome(str, 0, str.length() - 1);
        if (palindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
        int number = 12345;
        int sum = SumOfDigits.digits(number);
        System.out.println(sum);
        int[] array = {1, 5, 2, 15, 7, -8, 0};
        int[] result3 = MinMax.minMax(array, 0, array.length - 1);
        System.out.println("Min: " + result3[0]);
        System.out.println("Max: " + result3[1]);
    }
}

class Fibonacci {
    public static int fib(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}

class Factorial {
    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}

class Digit {
    public static int dig(int n, int k) {
        if (k == 0) {
            return 1;
        } else if (k == 1) {
            return n;
        } else {
            return n * dig(n, k - 1);
        }
    }
}

class Reverse {
    public static void reverse(int[] arr, int index) {
        if (index < 0) {
            return;
        }
        System.out.print(arr[index] + " ");
        reverse(arr, index - 1);
    }
}

class Palindrome {
    public static boolean palindrome(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return palindrome(str, left + 1, right - 1);
    }
}

class SumOfDigits {
    public static int digits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + digits(n / 10);
    }
}

class MinMax {
    public static int[] minMax(int[] array, int left, int right) {
        if (left == right) {
            return new int[]{array[left], array[left]};
        }

        if (right == left + 1) {
            int min = (array[left] < array[right]) ? array[left] : array[right];
            int max = (array[left] > array[right]) ? array[left] : array[right];
            return new int[]{min, max};
        }

        int mid = (left + right) / 2;
        int[] leftMinMax = minMax(array, left, mid);
        int[] rightMinMax = minMax(array, mid + 1, right);

        int min = (leftMinMax[0] < rightMinMax[0]) ? leftMinMax[0] : rightMinMax[0];
        int max = (leftMinMax[1] > rightMinMax[1]) ? leftMinMax[1] : rightMinMax[1];

        return new int[]{min, max};
    }
}







