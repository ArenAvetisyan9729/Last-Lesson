package Homework;

import java.util.Scanner;

public class ThirdHomework {

//===================STRINGS AND RECURSION=================//
//===================1=================//

    public static int countChars(String str, int index) {
        if (index == str.length()) {
            return 0;
        }
        return 1 + countChars(str, index + 1);
    }

    public static void printChars(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static String repeatString(String str, int times) {
        if (times <= 0) {
            return "Invalid time count";
        }
        return str + repeatString(str, times - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int characterCount = countChars(input, 0);

        System.out.println("The string has " + characterCount + " characters.");

//===================2=================//

        System.out.println("Enter a string: ");
        String input1 = scanner.nextLine();

        printChars(input1);

//===================3=================//

        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.println("Enter the number of repeats: ");
        int times = scanner.nextInt();

        String result = repeatString(inputString, times);
        System.out.println(result);
        scanner.close();
    }
}
