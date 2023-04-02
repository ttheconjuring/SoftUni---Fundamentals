package MethodsExercise;

import java.util.Scanner;

public class PalindromeIntegers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        while (!input.equals("END")) {
            System.out.println(isPalindrome(input));
            input = sc.nextLine();
        }

        sc.close();
    }

    public static String getTheReverseOf(String input) {
        int n = input.length();
        String reversedInput = "";
        for (int i = n - 1; i >= 0; i--) {
            reversedInput += String.valueOf(input.charAt(i));
        }
        return reversedInput;
    }

    public static boolean isPalindrome(String input) {
        return input.equals(getTheReverseOf(input));
    }

}
