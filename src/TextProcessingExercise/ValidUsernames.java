package TextProcessingExercise;

import java.util.Scanner;

public class ValidUsernames {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] inputArray = input.split(", ");

        for (String s : inputArray) {
            if (isValid(s)) {
                System.out.println(s);
            }
        }

        sc.close();
    }

    private static boolean isValid(String username) {
        int n = username.length();
        if (n < 3 || n > 16) {
            return false;
        }
        for (char ch : username.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                if (ch != '-') {
                    if (ch != '_') {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
