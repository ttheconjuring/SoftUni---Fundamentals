package TextProcessingExercise;

import java.util.Scanner;

public class LettersChangeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] inputArray = input.split("\\s+");
        int n = inputArray.length;

        double sum = 0;
        String lowerCaseAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String upperCaseAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < n; i++) {
            String currentInput = inputArray[i];
            double currentSum = 0;
            int number = Integer.parseInt(currentInput.substring(1, currentInput.length() - 1));

            // 1st char
            char firstLetter = currentInput.charAt(0);
            if (Character.isUpperCase(firstLetter)) {
                double denominator = upperCaseAlphabet.indexOf(firstLetter) + 1;
                double result = number / denominator;
                currentSum += result;
            } else if (Character.isLowerCase(firstLetter)) {
                double multiplier = lowerCaseAlphabet.indexOf(firstLetter) + 1;
                double result = number * multiplier;
                currentSum += result;
            }

            // 2nd char
            char lastLetter = currentInput.charAt(currentInput.length() - 1);
            if (Character.isUpperCase(lastLetter)) {
                double position = upperCaseAlphabet.indexOf(lastLetter) + 1;
                currentSum -= position;
            } else if (Character.isLowerCase(lastLetter)) {
                double position = lowerCaseAlphabet.indexOf(lastLetter) + 1;
                currentSum += position;
            }
            sum += currentSum;
        }

        System.out.printf("%.2f", sum);

        sc.close();
    }

}
// 0 1 2 3 4 5 6 7 8 9  10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
// a b c d e f g h i j  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26

// 0 1 2 3 4 5 6 7 8 9  10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
// A B C D E F G H I J  K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26