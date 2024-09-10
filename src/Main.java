import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//===================BRANCHING=================//
//===================1=================//

        int x = 10;
        int y = 14;
        int z = 25;

        if (x < y && y < z) {
            System.out.println("increasing");
        } else if (x > y && y > z) {
            System.out.println("decreasing");
        } else {
            System.out.println("neither");
        }

//===================2=================//

        int year = 2000;
        if ((year % 4 == 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

//===================3=================//

        Scanner sc = new Scanner(System.in);
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

//===================4=================//

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the semester: ");
        String semester = sc1.nextLine();
        System.out.println("Enter the program: ");
        String program = sc1.nextLine();

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

//===================LOOP======================//
//===================1=================//

        Scanner sc2 = new Scanner(System.in);
        int number = sc2.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int count = 0;
            int temp = number;

            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
            System.out.println("The number " + number + " has " + count + " digits.");

        }

//===================2=================//

        Scanner sc3 = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        System.out.println("How many numbers do you want to enter?");
        int count = sc3.nextInt();

        if (count <= 0) {
            System.out.println("Please enter a positive number of inputs.");
        } else {
            for (int i = 1; i <= count; i++) {
                System.out.println("Enter number " + i + ": ");
                int num = sc3.nextInt();

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

//===================3=================//

        Scanner scanner = new Scanner(System.in);
        String userResponse;

        do {
            double num3 = scanner.nextDouble();
            double num4 = scanner.nextDouble();

            double sum = num3 + num4;

            System.out.println("The sum is: " + sum);

            System.out.print("Do you want to perform the operation again? (yes/no): ");
            userResponse = scanner.next();

        } while (userResponse.equalsIgnoreCase("yes"));

        scanner.close();
        System.out.println("Program terminated.");

//===================4=================//

        Scanner scanner1 = new Scanner(System.in);

        int n = scanner1.nextInt();
        int k = scanner1.nextInt();

        int result = 1;
        for (int i = 0; i < k; i++) {
            result *= n;
        }

        System.out.println(n + " to the power of " + k + " is " + result);

        scanner.close();

//===================5=================//

        for (int number1 = 1; number1 <= 500; number1++) {
            int sumOfCubes = 0;
            int temp = number1;

            while (temp > 0) {
                int digit = temp % 10;
                sumOfCubes += digit * digit * digit;
                temp /= 10;
            }

            if (sumOfCubes == number1) {
                System.out.println(number1 + " is an Armstrong number.");
            }

        }

//===================6=================//

        Scanner scanner5 = new Scanner(System.in);
        int n2 = scanner5.nextInt();

        if (n2 <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int a = 0;
            int b = 1;

            for (int i = 0; i < n2; i++) {
                if (i == 0) {
                    System.out.println(a + " ");
                } else if (i == 1) {
                    System.out.println(b + " ");
                } else {
                    int next = a + b;
                    System.out.println(next + " ");
                    a = b;
                    b = next;
                }
            }
        }
        scanner.close();

//===================7=================//

        Scanner sc5 = new Scanner(System.in);

        System.out.println("Enter a positive integer n: ");
        int n6 = sc5.nextInt();

        if (n6 <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            double ln2Approximation = 0.0;

            for (int i = 1; i <= n6; i++) {
                if (i % 2 == 0) {
                    ln2Approximation -= 1.0 / i;
                } else {
                    ln2Approximation += 1.0 / i;
                }
            }
            System.out.println("Approximation of ln(2) using " + n + " terms: " + ln2Approximation);
        }

//===================ARRAYS======================//
//===================1=================//

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

//===================2=================//

        Scanner sc8 = new Scanner(System.in);

        int[] originalArray = {2, 5, 8, 7, 9, 10, 4};
        System.out.println("Original array: " + Arrays.toString(originalArray));

        System.out.println("Enter the element to remove: ");
        int elementToRemove = sc8.nextInt();

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
