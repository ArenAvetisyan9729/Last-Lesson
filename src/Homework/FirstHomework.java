package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class FirstHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BranchingLogic.checkBranching();
        LeapYearChecker.checkLeapYear();
        Calculator.performCalculation(sc);
        CourseRegistration.registerCourse(sc);
        DigitCounter.countDigits(sc);
        LargestSmallestFinder.findLargestAndSmallest(sc);
        SumCalculator.sumNumbers(sc);
        PowerCalculator.calculatePower(sc);
        ArmstrongNumberFinder.findArmstrongNumbers(sc);
        FibonacciGenerator.generateFibonacci(sc);
        LnApproximation.approximateLn(sc);
        ArrayMaxMinFinder.findMaxMin();
        ArrayElementRemover.removeElementFromArray(sc);

        sc.close();
    }
}

class BranchingLogic {
    public static void checkBranching() {
        int x = 10, y = 14, z = 25;
        if (x < y && y < z) {
            System.out.println("increasing");
        } else if (x > y && y > z) {
            System.out.println("decreasing");
        } else {
            System.out.println("neither");
        }
    }
}

class LeapYearChecker {
    public static void checkLeapYear() {
        int year = 2000;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

class Calculator {
    public static void performCalculation(Scanner sc) {
        System.out.println("Enter two numbers and an operator: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}

class CourseRegistration {
    public static void registerCourse(Scanner sc) {
        System.out.println("Enter the semester: ");
        String semester = sc.nextLine();
        System.out.println("Enter the program: ");
        String program = sc.nextLine();

        switch (semester) {
            case "fall":
                switch (program) {
                    case "CS":
                        System.out.println("Introduction to Computer Science");
                        break;
                    case "EC":
                        System.out.println("English Literature");
                        break;
                    default:
                        System.out.println("Invalid program.");
                }
                break;

            case "spring":
                switch (program) {
                    case "CS":
                        System.out.println("Object-Oriented Programming");
                        break;
                    case "EC":
                        System.out.println("Introduction to Journalism");
                        break;
                    default:
                        System.out.println("Invalid program.");
                }
                break;
            default:
                System.out.println("Invalid semester.");
        }
    }
}

class DigitCounter {
    public static void countDigits(Scanner sc) {
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive int.");
        } else {
            int count = 0;
            int temp = number;

            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
            System.out.println("The number " + number + " has " + count + " digits.");
        }
    }
}

class LargestSmallestFinder {
    public static void findLargestAndSmallest(Scanner sc) {
        System.out.println("How many numbers do you want to enter?");
        int count = sc.nextInt();

        if (count <= 0) {
            System.out.println("Please enter a positive number of inputs.");
        } else {
            int largest = Integer.MIN_VALUE;
            int smallest = Integer.MAX_VALUE;

            for (int i = 1; i <= count; i++) {
                System.out.println("Enter number " + i + ": ");
                int num = sc.nextInt();

                if (num > largest) {
                    largest = num;
                }
                if (num < smallest) {
                    smallest = num;
                }
            }
            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
        }
    }
}

class SumCalculator {
    public static void sumNumbers(Scanner sc) {
        String userResponse;

        do {
            System.out.println("Enter two numbers to sum: ");
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            double sum = num1 + num2;

            System.out.println("The sum is: " + sum);
            System.out.print("Do you want to perform the operation again? (yes/no): ");
            userResponse = sc.next();
        } while (userResponse.equalsIgnoreCase("yes"));
        System.out.println("Program terminated.");
    }
}

class PowerCalculator {
    public static void calculatePower(Scanner sc) {
        System.out.println("Enter base and exponent: ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 1;

        for (int i = 0; i < k; i++) {
            result *= n;
        }
        System.out.println(n + " to the power of " + k + " is " + result);
    }
}

class ArmstrongNumberFinder {
    public static void findArmstrongNumbers(Scanner sc) {
        System.out.println("Armstrong numbers between 1 and 500:");
        for (int number = 1; number <= 500; number++) {
            int sumOfCubes = 0;
            int temp = number;

            while (temp > 0) {
                int digit = temp % 10;
                sumOfCubes += digit * digit * digit;
                temp /= 10;
            }

            if (sumOfCubes == number) {
                System.out.println(number + " is an Armstrong number.");
            }
        }
    }
}

class FibonacciGenerator {
    public static void generateFibonacci(Scanner sc) {
        System.out.println("Enter the number of Fibonacci terms: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive int.");
        } else {
            int a = 0, b = 1;
            System.out.println("Fibonacci series: ");
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    System.out.print(a + " ");
                } else if (i == 1) {
                    System.out.print(b + " ");
                } else {
                    int next = a + b;
                    System.out.print(next + " ");
                    a = b;
                    b = next;
                }
            }
            System.out.println();
        }
    }
}

class LnApproximation {
    public static void approximateLn(Scanner sc) {
        System.out.println("Enter a positive int: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive int.");
        } else {
            double ln2Approximation = 0.0;

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    ln2Approximation -= 1.0 / i;
                } else {
                    ln2Approximation += 1.0 / i;
                }
            }
            System.out.println("Approximation of ln(2) using " + n + " terms: " + ln2Approximation);
        }
    }
}

class ArrayMaxMinFinder {
    public static void findMaxMin() {
        int[] numbers = {4, 5, 8, 3, 9, -1, 7, 10, -3};

        if (numbers.length == 0) {
            System.out.println("The array is empty.");
        } else {
            int max = numbers[0];
            int min = numbers[0];

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
            System.out.println("Maximum value: " + max);
            System.out.println("Minimum value: " + min);
        }
    }
}

class ArrayElementRemover {
    public static void removeElementFromArray(Scanner sc) {
        int[] originalArray = {2, 5, 8, 7, 9, 10, 4};
        System.out.println("Original array: " + Arrays.toString(originalArray));

        System.out.println("Enter the element to remove: ");
        int elementToRemove = sc.nextInt();

        int indexToRemove = -1;

        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] == elementToRemove) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove == -1) {
            System.out.println("Element not found");
        } else {
            int[] newArray = new int[originalArray.length - 1];

            for (int i = 0, j = 0; i < originalArray.length; i++) {
                if (i != indexToRemove) {
                    newArray[j++] = originalArray[i];
                }
            }

            System.out.println("Array after removing: " + Arrays.toString(newArray));
        }
    }
}