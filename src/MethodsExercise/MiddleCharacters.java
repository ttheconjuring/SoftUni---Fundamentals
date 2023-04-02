package MethodsExercise;

import java.util.Scanner;

public class MiddleCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println(getTheMiddle(input));

        sc.close();
    }

    public static String getTheMiddle(String input) {
        int n = input.length();
        String middle = "";
        if (n % 2 == 0) {
            int indexOfTheFirstCharacter = n / 2 - 1;
            int indexOfTheSecondCharacter = indexOfTheFirstCharacter + 1;
            middle += String.valueOf(input.charAt(indexOfTheFirstCharacter));
            middle += String.valueOf(input.charAt(indexOfTheSecondCharacter));
        } else {
            int indexOfTheMiddleCharacter = n / 2;
            middle += input.charAt(indexOfTheMiddleCharacter);
        }
        return middle;
    }

}
