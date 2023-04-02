package BasicSyntaxConditionalStatementsLoopsExercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String strN = String.valueOf(n);
        char[] digit = strN.toCharArray();
        int range = digit.length;
        int sum = 0;
        int currentFact;

        for (int i = 0; i < range; i++) {
            currentFact = 1;
            for (int j = 1; j <= Integer.parseInt(String.valueOf(digit[i])); j++) {
                currentFact *= j;
            }
            sum += currentFact;
        }

        if (n == sum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        sc.close();
    }
}
