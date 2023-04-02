package DataTypesAndVariablesMoreExercises;

import java.util.Scanner;

public class BalancedBrackets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String input;
        String str = "";

        for (int i = 0; i < n; i++) {
            input = sc.nextLine();
            str += input;
        }

        int m = str.length();

        for (int i = 0; i < m; i++) {
            if (str.charAt(i) == '(') {
                i++;
                while (str.charAt(i) != ')') {
                    if (str.charAt(i) == '(') {
                        System.out.println("UNBALANCED");
                        return;
                    }
                    i++;
                }
            }
        }

        int openingBracketCounter = 0;
        int closingBracketCounter = 0;

        for (int i = 0; i < m; i++) {
            if (str.charAt(i) == '(') {
                openingBracketCounter++;
            } else if (str.charAt(i) == ')') {
                closingBracketCounter++;
            } else {
                continue;
            }
        }

        if (openingBracketCounter == closingBracketCounter) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }

        sc.close();
    }

}