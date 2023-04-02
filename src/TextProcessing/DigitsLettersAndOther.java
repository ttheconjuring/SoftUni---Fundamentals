package TextProcessing;

import java.util.Scanner;

public class DigitsLettersAndOther {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int n = input.length();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char current = input.charAt(i);
            if (Character.isDigit(current)) {
                digits.append(current);
            } else if (Character.isLetter(current)) {
                letters.append(current);
            } else {
                others.append(current);
            }
        }

        System.out.println(digits.toString());
        System.out.println(letters.toString());
        System.out.println(others.toString());

        sc.close();
    }

}
