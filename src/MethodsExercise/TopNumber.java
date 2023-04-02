package MethodsExercise;

import java.util.Scanner;

public class TopNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int n = Integer.parseInt(input);

        for (int i = 0; i < n; i++) {
            String current = String.valueOf(i);
            if (hasSumDivisibleBy8(current) && hasAtLeast1OddDigit(current)) {
                System.out.println(i);
            }
        }

        sc.close();
    }

    public static int getTheSumOfDigitsOf(String input) {
        int sum = 0;
        int n = input.length();
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(String.valueOf(input.charAt(i)));
        }
        return sum;
    }

    public static boolean hasSumDivisibleBy8(String input) {
        return getTheSumOfDigitsOf(input) % 8 == 0;
    }

    public static int countTheOddDigitsOf(String input) {
        int counter = 0;
        int n = input.length();
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(String.valueOf(input.charAt(i))) % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean hasAtLeast1OddDigit(String input) {
        return countTheOddDigitsOf(input) >= 1;
    }


}
