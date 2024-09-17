package Homework;

import java.util.Scanner;

public class SecondHomeworkPartTwo {

//===================METHODS=================//
//===================2=================//

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the upper bound for the number: ");
        int n = scanner.nextInt();

        int low = 0;
        int high = n;
        int guess = 0;
        boolean correctNumber = false;

        System.out.println("Number between 0 and " + n);

        while (!correctNumber) {

            guess = (low + high) / 2;
            System.out.println("Is the number " + guess + "?");

            System.out.print("Enter 'c' if it's correct, 'h' if the number is higher, 'l' if the number is lower: ");
            char answer = scanner.next().charAt(0);

            if (answer == 'c') {
                System.out.println("I guessed the number " + guess);
                correctNumber = true;
            } else if (answer == 'h') {
                low = guess + 1;
            } else if (answer == 'l') {
                high = guess - 1;
            } else {
                System.out.println("Invalid input. Please enter 'c', 'h', or 'l'.");
            }
        }
        scanner.close();
    }
}
