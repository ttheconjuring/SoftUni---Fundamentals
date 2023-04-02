package MethodsExercise;

import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();

        if (hasValidLength(password) && consistsOnlyOfLetterAndDigits(password) && hasAtLeastTwoDigits(password)) {
            System.out.println("Password is valid");
        } else {
            if (!hasValidLength(password)) {
                System.out.println("Password must be between 6 and 10 characters");
            }
            if (!consistsOnlyOfLetterAndDigits(password)) {
                System.out.println("Password must consist only of letters and digits");
            }
            if (!hasAtLeastTwoDigits(password)) {
                System.out.println("Password must have at least 2 digits");
            }
        }

        sc.close();
    }

    public static boolean hasValidLength(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    public static boolean consistsOnlyOfLetterAndDigits(String password) {
        int n = password.length();
        for (char ch : password.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    public static int countDigits(String password) {
        int counter = 0;
        int n = password.length();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 9; j++) {
                if (String.valueOf(password.charAt(i)).equals(String.valueOf(j))) {
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }

    public static boolean hasAtLeastTwoDigits(String password) {
        return countDigits(password) >= 2;
    }

}
