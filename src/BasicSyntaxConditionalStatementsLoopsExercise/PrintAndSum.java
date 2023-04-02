package BasicSyntaxConditionalStatementsLoopsExercise;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int beginning = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());
        int sum = 0;

        for (int i = beginning; i <= end; i++) {
            System.out.print(i + " ");
            sum += i;
        }

        System.out.println();
        System.out.println("Sum: " + sum);

        sc.close();
    }
}
